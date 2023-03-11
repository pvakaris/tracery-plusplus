/**
 * generated by Xtext 2.30.0
 */
package tracerypp.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import tracerypp.traceryPlusPlus.Attribute;
import tracerypp.traceryPlusPlus.Declaration;
import tracerypp.traceryPlusPlus.JustNameAttribute;
import tracerypp.traceryPlusPlus.ListDeclaration;
import tracerypp.traceryPlusPlus.NameExistingListAttribute;
import tracerypp.traceryPlusPlus.NameValueAttribute;
import tracerypp.traceryPlusPlus.ObjectAttribute;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.Pronouns;
import tracerypp.traceryPlusPlus.Statement;
import tracerypp.traceryPlusPlus.StoryVariable;
import tracerypp.traceryPlusPlus.TraceryPlusPlusProgram;
import tracerypp.traceryPlusPlus.Variable;
import tracerypp.traceryPlusPlus.Word;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class TraceryPlusPlusGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    TraceryPlusPlusProgram model = ((TraceryPlusPlusProgram) _head);
    fsa.generateFile(this.deriveTargetFilenameFor(model, resource), this.generate(model));
  }

  public String deriveTargetFilenameFor(final TraceryPlusPlusProgram program, final Resource resource) {
    return "translated_tracerypp_grammar.json";
  }

  public CharSequence generate(final TraceryPlusPlusProgram program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    final Function1<Declaration, CharSequence> _function = (Declaration it) -> {
      return this.generateJsonDeclaration(it);
    };
    String _join = IterableExtensions.join(IterableExtensions.<Declaration, CharSequence>map(Iterables.<Declaration>filter(program.getStatements(), Declaration.class), _function), "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"story\": [\"");
    final Function1<EObject, String> _function_1 = (EObject it) -> {
      return this.generateJsonStoryEntry(it);
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<EObject, String>map(program.getStory().getStory(), _function_1), "");
    _builder.append(_join_1, "\t");
    _builder.append("\"],");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"origin\": [\"#");
    {
      Iterable<String> _objectDeclarationSetters = this.getObjectDeclarationSetters(program.getStatements());
      for(final String entry : _objectDeclarationSetters) {
        _builder.append("[#");
        _builder.append(entry, "\t");
        _builder.append("#]");
      }
    }
    _builder.append("story#\"]");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public Iterable<String> getObjectDeclarationSetters(final List<Statement> statements) {
    Iterable<ObjectDeclaration> objectDeclarations = Iterables.<ObjectDeclaration>filter((Iterables.<Declaration>filter(statements, Declaration.class)), ObjectDeclaration.class);
    final Function1<ObjectDeclaration, String> _function = (ObjectDeclaration declaration) -> {
      String _xblockexpression = null;
      {
        final String name = declaration.getName().toString();
        String _upperCase = name.substring(0, 1).toUpperCase();
        String _plus = ("set" + _upperCase);
        String _substring = name.substring(1);
        _xblockexpression = (_plus + _substring);
      }
      return _xblockexpression;
    };
    final Iterable<String> setters = IterableExtensions.<ObjectDeclaration, String>map(objectDeclarations, _function);
    return setters;
  }

  protected String _generateJsonStoryEntry(final ObjectAttribute objectAttribute) {
    final String object = objectAttribute.getObject().getName();
    Variable _attribute = objectAttribute.getAttribute();
    boolean _tripleNotEquals = (_attribute != null);
    if (_tripleNotEquals) {
      final String attribute = objectAttribute.getAttribute().getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#");
      String _upperCase = attribute.substring(0, 1).toUpperCase();
      String _plus = (object + _upperCase);
      String _substring = attribute.substring(1);
      String _plus_1 = (_plus + _substring);
      _builder.append(_plus_1);
      {
        EList<String> _modifiers = objectAttribute.getModifiers();
        for(final String mod : _modifiers) {
          _builder.append(mod);
        }
      }
      _builder.append("#");
      return _builder.toString();
    } else {
      final String attribute_1 = objectAttribute.getPronoun().getName();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("#");
      String _upperCase_1 = attribute_1.substring(0, 1).toUpperCase();
      String _plus_2 = (object + _upperCase_1);
      String _substring_1 = attribute_1.substring(1);
      String _plus_3 = (_plus_2 + _substring_1);
      _builder_1.append(_plus_3);
      {
        EList<String> _modifiers_1 = objectAttribute.getModifiers();
        for(final String mod_1 : _modifiers_1) {
          _builder_1.append(mod_1);
        }
      }
      _builder_1.append("#");
      return _builder_1.toString();
    }
  }

  protected String _generateJsonStoryEntry(final Word word) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = word.getValue();
    _builder.append(_value);
    return _builder.toString();
  }

  protected String _generateJsonStoryEntry(final StoryVariable storyVariable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    String _name = storyVariable.getVariable().getName();
    _builder.append(_name);
    {
      EList<String> _modifiers = storyVariable.getModifiers();
      for(final String mod : _modifiers) {
        _builder.append(mod);
      }
    }
    _builder.append("#");
    return _builder.toString();
  }

  protected CharSequence _generateJsonDeclaration(final ListDeclaration listDeclaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = listDeclaration.getName().getName();
    _builder.append(_name);
    _builder.append("\": [");
    {
      EList<Word> _words = listDeclaration.getList().getWords();
      boolean _hasElements = false;
      for(final Word word : _words) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append("\"");
        String _value = word.getValue();
        _builder.append(_value);
        _builder.append("\"");
      }
    }
    _builder.append("],");
    return _builder.toString();
  }

  protected CharSequence _generateJsonDeclaration(final ObjectDeclaration objectDeclaration) {
    final String name = objectDeclaration.getName().toString();
    String _upperCase = name.substring(0, 1).toUpperCase();
    String _plus = ("set" + _upperCase);
    String _substring = name.substring(1);
    final String setter = (_plus + _substring);
    final String pronouns = this.matchPronouns(objectDeclaration.getPronouns(), name);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    _builder.append(setter);
    _builder.append("\": [\"");
    {
      EList<Attribute> _attributes = objectDeclaration.getAttributes().getAttributes();
      for(final Attribute attribute : _attributes) {
        String _stringForAttribute = this.getStringForAttribute(attribute, name);
        _builder.append(_stringForAttribute);
      }
    }
    _builder.append(pronouns);
    _builder.append("\"],");
    return _builder.toString();
  }

  public String matchPronouns(final Pronouns pronouns, final String name) {
    final String value = pronouns.getValue();
    boolean _equals = Objects.equal(value, "He");
    if (_equals) {
      return (((((((("[" + name) + "They:he][") + name) + "Them:him][") + name) + "Their:his][") + name) + "Theirs:his]");
    } else {
      boolean _equals_1 = Objects.equal(value, "She");
      if (_equals_1) {
        return (((((((("[" + name) + "They:she][") + name) + "Them:her][") + name) + "Their:her][") + name) + "Theirs:hers]");
      } else {
        boolean _equals_2 = Objects.equal(value, "It");
        if (_equals_2) {
          return (((((((("[" + name) + "They:it][") + name) + "Them:it][") + name) + "Their:its][") + name) + "Theirs:its]");
        } else {
          boolean _equals_3 = Objects.equal(value, "They");
          if (_equals_3) {
            return (((((((("[" + name) + "They:they][") + name) + "Them:them][") + name) + "Their:their][") + name) + "Theirs:theirs]");
          } else {
            return "pimpalauskas";
          }
        }
      }
    }
  }

  public String getStringForAttribute(final Attribute attribute, final String objectName) {
    if ((attribute instanceof NameValueAttribute)) {
      final String variableName = ((NameValueAttribute)attribute).getName().getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      String _upperCase = variableName.substring(0, 1).toUpperCase();
      String _plus = (objectName + _upperCase);
      String _substring = variableName.substring(1);
      String _plus_1 = (_plus + _substring);
      _builder.append(_plus_1);
      _builder.append(":");
      String _value = ((NameValueAttribute)attribute).getValue().getValue();
      _builder.append(_value);
      _builder.append("]");
      return _builder.toString();
    } else {
      if ((attribute instanceof JustNameAttribute)) {
        final String variableName_1 = ((JustNameAttribute)attribute).getName().getPointer().getName();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("[");
        String _upperCase_1 = variableName_1.substring(0, 1).toUpperCase();
        String _plus_2 = (objectName + _upperCase_1);
        String _substring_1 = variableName_1.substring(1);
        String _plus_3 = (_plus_2 + _substring_1);
        _builder_1.append(_plus_3);
        _builder_1.append(":#");
        _builder_1.append(variableName_1);
        _builder_1.append("#]");
        return _builder_1.toString();
      } else {
        if ((attribute instanceof NameExistingListAttribute)) {
          final String variableName_2 = ((NameExistingListAttribute)attribute).getName().getName();
          final String value = ((NameExistingListAttribute)attribute).getValue().getPointer().getName();
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("[");
          String _upperCase_2 = variableName_2.substring(0, 1).toUpperCase();
          String _plus_4 = (objectName + _upperCase_2);
          String _substring_2 = variableName_2.substring(1);
          String _plus_5 = (_plus_4 + _substring_2);
          _builder_2.append(_plus_5);
          _builder_2.append(":#");
          _builder_2.append(value);
          _builder_2.append("#]");
          return _builder_2.toString();
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          return _builder_3.toString();
        }
      }
    }
  }

  protected CharSequence _generateJsonDeclaration(final Declaration listDeclaration) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }

  public String generateJsonStoryEntry(final EObject objectAttribute) {
    if (objectAttribute instanceof ObjectAttribute) {
      return _generateJsonStoryEntry((ObjectAttribute)objectAttribute);
    } else if (objectAttribute instanceof StoryVariable) {
      return _generateJsonStoryEntry((StoryVariable)objectAttribute);
    } else if (objectAttribute instanceof Word) {
      return _generateJsonStoryEntry((Word)objectAttribute);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(objectAttribute).toString());
    }
  }

  public CharSequence generateJsonDeclaration(final Declaration listDeclaration) {
    if (listDeclaration instanceof ListDeclaration) {
      return _generateJsonDeclaration((ListDeclaration)listDeclaration);
    } else if (listDeclaration instanceof ObjectDeclaration) {
      return _generateJsonDeclaration((ObjectDeclaration)listDeclaration);
    } else if (listDeclaration != null) {
      return _generateJsonDeclaration(listDeclaration);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(listDeclaration).toString());
    }
  }
}
