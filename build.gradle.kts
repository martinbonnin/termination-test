plugins {
  id("org.jetbrains.kotlin.jvm").version("1.6.0")
  id("com.apollographql.apollo3").version("3.0.0-beta04")
  id("application")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.apollographql.apollo3:apollo-runtime:3.0.0-beta04")
  implementation("com.apollographql.apollo3:apollo-mockserver:3.0.0-beta04")
}

apollo {
  packageName.set("com.example")
}

application {
  this.mainClass.set("com.example.MainKt")
}