// In this section you declare the dependencies for your production and test code
dependencies {
	// Project
	api(project(":api"))
	testImplementation(project(":core"))
	testImplementation(testFixtures(project(":core")))

	// Spring
	implementation(group = "org.springframework.boot", name = "spring-boot-starter", version = "2.5.2")
}

publishing.publications.withType<MavenPublication> {
	artifactId = "events4j-handler-spring"
	pom {
		name.set("Events4J Handler - Spring")
		description.set("Events4J Handler - Spring")
	}
}
