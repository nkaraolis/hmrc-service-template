resolvers ++= Seq(
  Resolver.url("hmrc-sbt-plugin-releases",
    url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))
  (Resolver.ivyStylePatterns),
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.12")

addSbtPlugin("uk.gov.hmrc" % "sbt-distributables" % "1.0.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-git-versioning" % "0.9.0")
