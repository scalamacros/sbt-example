import language.experimental.macros
import scala.reflect.macros.Context

object Macros {
  def impl(c: Context) = c.universe.reify(println("hello world!"))
  def hello = macro impl
}