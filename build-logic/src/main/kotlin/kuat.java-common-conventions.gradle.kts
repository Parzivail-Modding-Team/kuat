/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
	// Apply the java Plugin to add support for Java.
	java
}

repositories {
	// Use Maven Central for resolving dependencies.
	mavenCentral()
}

dependencies {
	constraints {
		// Define dependency versions as constraints
		// TODO
	}
}

testing {
	suites {
		// Configure the built-in test suite
		val test by getting(JvmTestSuite::class) {
			// Use JUnit Jupiter test framework
			useJUnitJupiter("5.10.0")
		}
	}
}

// Apply a specific Java toolchain to ease working on different environments.
java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}