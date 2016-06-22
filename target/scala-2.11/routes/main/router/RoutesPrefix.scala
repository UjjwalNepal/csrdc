
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ujjwal/csrdc/conf/routes
// @DATE:Wed Jun 22 07:03:37 NPT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
