/*
 * generated by Xtext 2.30.0
 */
package tracerypp


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TraceryPlusPlusStandaloneSetup extends TraceryPlusPlusStandaloneSetupGenerated {

	def static void doSetup() {
		new TraceryPlusPlusStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
