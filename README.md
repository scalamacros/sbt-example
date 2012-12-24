An example SBT project which uses macros (Scala 2.10, SBT 0.12)

To verify that everything works fine, do `sbt run`.

Note that currently SBT doesn't support recompilation of macro clients if macro implementation has changed: https://github.com/harrah/xsbt/issues/399.

Huge thanks to Paul Butcher (https://github.com/paulbutcher/ScalaMock/blob/typemacros/project/Build.scala) and Adam Warski (https://github.com/adamw/scala-macro-debug) whose SBT projects I used as prototypes for this one.
