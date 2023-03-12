/**
 * generated by Xtext 2.30.0
 */
package tracerypp.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tracerypp.traceryPlusPlus.TraceryPlusPlusProgram;

/**
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
    return _builder;
  }
}
