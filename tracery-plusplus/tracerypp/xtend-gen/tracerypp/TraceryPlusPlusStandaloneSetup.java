/**
 * generated by Xtext 2.30.0
 */
package tracerypp;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TraceryPlusPlusStandaloneSetup extends TraceryPlusPlusStandaloneSetupGenerated {
  public static void doSetup() {
    new TraceryPlusPlusStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
