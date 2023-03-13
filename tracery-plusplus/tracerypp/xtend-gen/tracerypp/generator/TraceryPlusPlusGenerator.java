/**
 * generated by Xtext 2.30.0
 */
package tracerypp.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import tracerypp.traceryPlusPlus.Attribute;
import tracerypp.traceryPlusPlus.ListDeclaration;
import tracerypp.traceryPlusPlus.ListUse;
import tracerypp.traceryPlusPlus.NameExistingListAttribute;
import tracerypp.traceryPlusPlus.NameValueAttribute;
import tracerypp.traceryPlusPlus.ObjectAttribute;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.ObjectPronoun;
import tracerypp.traceryPlusPlus.ObjectUse;
import tracerypp.traceryPlusPlus.Pronouns;
import tracerypp.traceryPlusPlus.Statement;
import tracerypp.traceryPlusPlus.Story;
import tracerypp.traceryPlusPlus.SubstoryDeclaration;
import tracerypp.traceryPlusPlus.SubstoryUse;
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
    ArrayList<String> substoryObjectInitialisations = this.getSubstoryObjectDeclarations(program.getStatements());
    ArrayList<String> storyObjectInitialisations = this.getStoryObjectDeclarations(program.getStory(), program.getStatements());
    ArrayList<String> allObjectNames = this.getObjectNames(substoryObjectInitialisations);
    allObjectNames.addAll(this.getObjectNames(storyObjectInitialisations));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    {
      Iterable<ListDeclaration> _filter = Iterables.<ListDeclaration>filter((Iterables.<Variable>filter(program.getStatements(), Variable.class)), ListDeclaration.class);
      for(final ListDeclaration listDeclaration : _filter) {
        String _generateJsonListDeclaration = this.generateJsonListDeclaration(listDeclaration);
        String _plus = (_generateJsonListDeclaration + "\n");
        _builder.append(_plus, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      for(final String initSubObj : substoryObjectInitialisations) {
        _builder.append((initSubObj + "\n"), "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      for(final String initStoryObj : storyObjectInitialisations) {
        _builder.append((initStoryObj + "\n"), "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Iterable<SubstoryDeclaration> _filter_1 = Iterables.<SubstoryDeclaration>filter((Iterables.<Variable>filter(program.getStatements(), Variable.class)), SubstoryDeclaration.class);
      for(final SubstoryDeclaration substory : _filter_1) {
        _builder.append("\"");
        String _string = substory.getName().toString();
        _builder.append(_string, "\t");
        _builder.append("\": [\"");
        final Function1<EObject, String> _function = (EObject it) -> {
          return this.generateJsonStoryEntry(it, substory.getName().toString());
        };
        String _join = IterableExtensions.join(ListExtensions.<EObject, String>map(substory.getStory(), _function), "");
        _builder.append(_join, "\t");
        _builder.append("\"],");
        _builder.append("\n", "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"story\": [\"");
    final Function1<EObject, String> _function_1 = (EObject it) -> {
      return this.generateJsonStoryEntry(it, "story");
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<EObject, String>map(program.getStory().getStory(), _function_1), "");
    _builder.append(_join_1, "\t");
    _builder.append("\"],");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"origin\": [\"#");
    {
      for(final String entry : allObjectNames) {
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

  public ArrayList<String> getObjectNames(final List<String> declarations) {
    ArrayList<String> strings = CollectionLiterals.<String>newArrayList();
    for (final String dec : declarations) {
      {
        String name = dec.split(":")[0];
        int _indexOf = name.indexOf("\"");
        int start = (_indexOf + 1);
        int end = name.indexOf("\"", start);
        strings.add(name.substring(start, end));
      }
    }
    return strings;
  }

  public String generateJsonListDeclaration(final ListDeclaration listDeclaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = listDeclaration.getName();
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

  public ArrayList<String> getSubstoryObjectDeclarations(final List<Statement> statements) {
    Iterable<SubstoryDeclaration> substories = Iterables.<SubstoryDeclaration>filter((Iterables.<Variable>filter(statements, Variable.class)), SubstoryDeclaration.class);
    final ArrayList<String> strings = CollectionLiterals.<String>newArrayList();
    for (final SubstoryDeclaration substory : substories) {
      {
        Iterable<ObjectUse> objects = Iterables.<ObjectUse>filter(substory.getStory(), ObjectUse.class);
        ArrayList<ObjectDeclaration> alreadyInitialisedObjects = CollectionLiterals.<ObjectDeclaration>newArrayList();
        for (final ObjectUse objectUse : objects) {
          {
            final ObjectDeclaration object = objectUse.getObject();
            final String objectName = object.getName().toString();
            final Iterable<ObjectDeclaration> objectDeclarations = Iterables.<ObjectDeclaration>filter((Iterables.<Variable>filter(statements, Variable.class)), ObjectDeclaration.class);
            final ObjectDeclaration rightObjectDeclaration = this.findTheRightObjectDeclaration(objectDeclarations, objectName);
            if (((rightObjectDeclaration != null) && (!alreadyInitialisedObjects.contains(rightObjectDeclaration)))) {
              String _upperCase = objectName.substring(0, 1).toUpperCase();
              String _plus = ("set" + _upperCase);
              String _substring = objectName.substring(1);
              String _plus_1 = (_plus + _substring);
              String _plus_2 = (_plus_1 + "-");
              String _name = substory.getName();
              final String setter = (_plus_2 + _name);
              final String pronouns = this.matchPronouns(rightObjectDeclaration.getPronouns(), objectName, substory.getName());
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("\"");
              _builder.append(setter);
              _builder.append("\": [\"");
              {
                EList<Attribute> _attributes = rightObjectDeclaration.getAttributes().getAttributes();
                for(final Attribute attribute : _attributes) {
                  String _stringForAttribute = this.getStringForAttribute(attribute, objectName, substory.getName());
                  _builder.append(_stringForAttribute);
                }
              }
              _builder.append(pronouns);
              _builder.append("\"],");
              strings.add(_builder.toString());
              alreadyInitialisedObjects.add(rightObjectDeclaration);
            }
          }
        }
      }
    }
    return strings;
  }

  public ObjectDeclaration findTheRightObjectDeclaration(final Iterable<ObjectDeclaration> objectDeclarations, final String name) {
    for (final ObjectDeclaration objDeclaration : objectDeclarations) {
      String _string = objDeclaration.getName().toString();
      boolean _equals = Objects.equal(_string, name);
      if (_equals) {
        return objDeclaration;
      }
    }
    return null;
  }

  public String getStringForAttribute(final Attribute attribute, final String objectName, final String storyname) {
    if ((attribute instanceof NameValueAttribute)) {
      final String variableName = ((NameValueAttribute)attribute).getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      String _upperCase = variableName.substring(0, 1).toUpperCase();
      String _plus = (objectName + _upperCase);
      String _substring = variableName.substring(1);
      String _plus_1 = (_plus + _substring);
      String _plus_2 = (_plus_1 + "-");
      String _plus_3 = (_plus_2 + storyname);
      _builder.append(_plus_3);
      _builder.append(":");
      String _value = ((NameValueAttribute)attribute).getValue().getValue();
      _builder.append(_value);
      _builder.append("]");
      return _builder.toString();
    } else {
      if ((attribute instanceof NameExistingListAttribute)) {
        final String variableName_1 = ((NameExistingListAttribute)attribute).getName();
        final ListDeclaration list = ((NameExistingListAttribute)attribute).getValue();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("[");
        String _upperCase_1 = variableName_1.substring(0, 1).toUpperCase();
        String _plus_4 = (objectName + _upperCase_1);
        String _substring_1 = variableName_1.substring(1);
        String _plus_5 = (_plus_4 + _substring_1);
        String _plus_6 = (_plus_5 + "-");
        String _plus_7 = (_plus_6 + storyname);
        _builder_1.append(_plus_7);
        _builder_1.append(":#");
        String _name = list.getName();
        _builder_1.append(_name);
        _builder_1.append("#]");
        return _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        return _builder_2.toString();
      }
    }
  }

  /**
   * Get a list of variable declarations for the main story part
   */
  public ArrayList<String> getStoryObjectDeclarations(final Story story, final List<Statement> statements) {
    ArrayList<String> strings = CollectionLiterals.<String>newArrayList();
    Iterable<ObjectUse> objects = Iterables.<ObjectUse>filter(story.getStory(), ObjectUse.class);
    ArrayList<ObjectDeclaration> alreadyInitialisedObjects = CollectionLiterals.<ObjectDeclaration>newArrayList();
    for (final ObjectUse objectUse : objects) {
      {
        final ObjectDeclaration object = objectUse.getObject();
        final String objectName = object.getName().toString();
        final Iterable<ObjectDeclaration> objectDeclarations = Iterables.<ObjectDeclaration>filter((Iterables.<Variable>filter(statements, Variable.class)), ObjectDeclaration.class);
        final ObjectDeclaration rightObjectDeclaration = this.findTheRightObjectDeclaration(objectDeclarations, objectName);
        if (((rightObjectDeclaration != null) && (!alreadyInitialisedObjects.contains(rightObjectDeclaration)))) {
          String _upperCase = objectName.substring(0, 1).toUpperCase();
          String _plus = ("set" + _upperCase);
          String _substring = objectName.substring(1);
          String _plus_1 = (_plus + _substring);
          final String setter = (_plus_1 + "-story");
          final String pronouns = this.matchPronouns(rightObjectDeclaration.getPronouns(), objectName, "story");
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"");
          _builder.append(setter);
          _builder.append("\": [\"");
          {
            EList<Attribute> _attributes = rightObjectDeclaration.getAttributes().getAttributes();
            for(final Attribute attribute : _attributes) {
              String _stringForAttribute = this.getStringForAttribute(attribute, objectName, "story");
              _builder.append(_stringForAttribute);
            }
          }
          _builder.append(pronouns);
          _builder.append("\"],");
          strings.add(_builder.toString());
          alreadyInitialisedObjects.add(rightObjectDeclaration);
        }
      }
    }
    return strings;
  }

  /**
   * DISPATCH
   */
  protected String _generateJsonStoryEntry(final ObjectUse object, final String storyname) {
    final String objectName = object.getObject().getName();
    if ((object instanceof ObjectAttribute)) {
      final String attribute = this.getAttributeName(((ObjectAttribute)object).getAttribute());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#");
      String _upperCase = attribute.substring(0, 1).toUpperCase();
      String _plus = (objectName + _upperCase);
      String _substring = attribute.substring(1);
      String _plus_1 = (_plus + _substring);
      String _plus_2 = (_plus_1 + "-");
      String _plus_3 = (_plus_2 + storyname);
      _builder.append(_plus_3);
      {
        EList<String> _modifiers = ((ObjectAttribute)object).getModifiers();
        for(final String mod : _modifiers) {
          _builder.append(mod);
        }
      }
      _builder.append("#");
      return _builder.toString();
    } else {
      if ((object instanceof ObjectPronoun)) {
        final String attribute_1 = ((ObjectPronoun)object).getPronoun().getName();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("#");
        String _upperCase_1 = attribute_1.substring(0, 1).toUpperCase();
        String _plus_4 = (objectName + _upperCase_1);
        String _substring_1 = attribute_1.substring(1);
        String _plus_5 = (_plus_4 + _substring_1);
        String _plus_6 = (_plus_5 + "-");
        String _plus_7 = (_plus_6 + storyname);
        _builder_1.append(_plus_7);
        _builder_1.append("#");
        return _builder_1.toString();
      }
    }
    return null;
  }

  protected String _generateJsonStoryEntry(final Word word, final String storyname) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = word.getValue();
    _builder.append(_value);
    return _builder.toString();
  }

  protected String _generateJsonStoryEntry(final ListUse storyVariable, final String storyname) {
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

  protected String _generateJsonStoryEntry(final SubstoryUse storyVariable, final String storyname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    String _name = storyVariable.getVariable().getName();
    _builder.append(_name);
    _builder.append("#");
    return _builder.toString();
  }

  /**
   * ADDITIONAL HELPER METHODS
   */
  public String getAttributeName(final Attribute attribute) {
    if ((attribute instanceof NameExistingListAttribute)) {
      return ((NameExistingListAttribute)attribute).getName();
    } else {
      if ((attribute instanceof NameValueAttribute)) {
        return ((NameValueAttribute)attribute).getName();
      }
    }
    return null;
  }

  public String matchPronouns(final Pronouns pronouns, final String name, final String storyname) {
    final String value = pronouns.getValue();
    boolean _equals = Objects.equal(value, "He");
    if (_equals) {
      return (((((((((((((((("[" + name) + "They-") + storyname) + ":he][") + name) + "Them-") + storyname) + ":him][") + name) + "Their-") + storyname) + ":his][") + name) + "Theirs-") + storyname) + ":his]");
    } else {
      boolean _equals_1 = Objects.equal(value, "She");
      if (_equals_1) {
        return (((((((((((((((("[" + name) + "They-") + storyname) + ":she][") + name) + "Them-") + storyname) + ":her][") + name) + "Their-") + storyname) + ":her][") + name) + "Theirs-") + storyname) + ":hers]");
      } else {
        boolean _equals_2 = Objects.equal(value, "It");
        if (_equals_2) {
          return (((((((((((((((("[" + name) + "They-") + storyname) + ":it][") + name) + "Them-") + storyname) + ":it][") + name) + "Their-") + storyname) + ":its][") + name) + "Theirs-") + storyname) + ":its]");
        } else {
          boolean _equals_3 = Objects.equal(value, "They");
          if (_equals_3) {
            return (((((((((((((((("[" + name) + "They-") + storyname) + ":they][") + name) + "Them-") + storyname) + ":them][") + name) + "Their-") + storyname) + ":their][") + name) + "Theirs-") + storyname) + ":theirs]");
          } else {
            return "unknown";
          }
        }
      }
    }
  }

  public String generateJsonStoryEntry(final EObject storyVariable, final String storyname) {
    if (storyVariable instanceof ListUse) {
      return _generateJsonStoryEntry((ListUse)storyVariable, storyname);
    } else if (storyVariable instanceof ObjectUse) {
      return _generateJsonStoryEntry((ObjectUse)storyVariable, storyname);
    } else if (storyVariable instanceof SubstoryUse) {
      return _generateJsonStoryEntry((SubstoryUse)storyVariable, storyname);
    } else if (storyVariable instanceof Word) {
      return _generateJsonStoryEntry((Word)storyVariable, storyname);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(storyVariable, storyname).toString());
    }
  }
}
