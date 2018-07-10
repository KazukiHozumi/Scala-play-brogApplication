// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.16")

libraryDependencies += "com.h2database" % "h2" % "1.4.193"
addSbtPlugin("org.scalikejdbc" %% "scalikejdbc-mapper-generator" % "2.5.1")