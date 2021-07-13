// In this section you declare the dependencies for your production and test code
dependencies {
	// Project
	api(project(":api"))
	testImplementation(project(":core"))
	testImplementation(testFixtures(project(":core")))

	// Reactor - see https://repo1.maven.org/maven2/io/projectreactor/reactor-bom/Dysprosium-SR12/reactor-bom-Dysprosium-SR12.pom
	api(group = "io.projectreactor", name = "reactor-core", version = "3.3.10.RELEASE")
	api(group = "io.projectreactor.addons", name = "reactor-extra", version = "3.3.4.RELEASE")
	testImplementation(group = "io.projectreactor", name = "reactor-test", version = "3.4.8")
}

publishing.publications.withType<MavenPublication> {
	artifactId = "events4j-handler-reactor"
	pom {
		name.set("Events4J Handler - Reactor")
		description.set("Events4J Handler - Reactor")
	}
}
