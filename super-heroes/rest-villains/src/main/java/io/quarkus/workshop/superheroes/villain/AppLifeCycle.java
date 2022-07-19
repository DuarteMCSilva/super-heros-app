package io.quarkus.workshop.superheroes.villain;

import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AppLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(AppLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {
        LOGGER.info(" -----------------------------------------------------");
        LOGGER.info(" \\ \\   / (_) | | __ _(_)_ __       / \\  |  _ \\_ _|");
        LOGGER.info("  \\ \\ / /| | | |/ _` | | '_ \\     / _ \\ | |_) | | ");
        LOGGER.info("   \\ V / | | | | (_| | | | | |   / ___ \\|  __/| | ");
        LOGGER.info("    \\_/  |_|_|_|\\__,_|_|_| |_|  /_/   \\_\\_|  |___|");

        LOGGER.info("The application VILLAIN is starting with profile " + ProfileManager.getActiveProfile());
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application VILLAIN is stopping...");
    }
}
