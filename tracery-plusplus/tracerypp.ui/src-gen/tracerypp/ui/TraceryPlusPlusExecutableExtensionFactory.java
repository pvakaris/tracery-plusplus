/*
 * generated by Xtext 2.30.0
 */
package tracerypp.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import tracerypp.ui.internal.TraceryppActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TraceryPlusPlusExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(TraceryppActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		TraceryppActivator activator = TraceryppActivator.getInstance();
		return activator != null ? activator.getInjector(TraceryppActivator.TRACERYPP_TRACERYPLUSPLUS) : null;
	}

}
