
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
  <head lang="en">
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <div id="front">
      <div class="site-header">
        <div class="container">
          <div class="row">
            <div class="col-md-4 col-sm-6 col-xs-6">
              <div id="logo">
                <h1><a href="#">csrdcnepal</a></h1>
              </div> <!-- /.logo -->
            </div> <!-- /.col-md-4 -->
            <div class="col-md-8 col-sm-6 col-xs-6">
              <a href="#" class="toggle-menu"><i class="fa fa-bars"></i></a>
              <div class="main-menu">
                <ul>
                  <li><a href=""""),_display_(/*21.33*/routes/*21.39*/.Application.index),format.raw/*21.57*/("""#front">Home</a></li>
                  <li><a href=""""),_display_(/*22.33*/routes/*22.39*/.Application.index),format.raw/*22.57*/("""#services">Services</a></li>
                  <li><a href=""""),_display_(/*23.33*/routes/*23.39*/.Application.index),format.raw/*23.57*/("""#career">Careers</a></li>
                  <li><a href=""""),_display_(/*24.33*/routes/*24.39*/.Application.blog),format.raw/*24.56*/("""">Blog</a></li>
                  <li><a href=""""),_display_(/*25.33*/routes/*25.39*/.Application.index),format.raw/*25.57*/("""#about">About</a></li>
                  <li><a href=""""),_display_(/*26.33*/routes/*26.39*/.Application.index),format.raw/*26.57*/("""#contact">Contact</a></li>
                </ul>
              </div><!-- /.main-menu -->
            </div> <!-- /.col-md-8 -->
          </div> <!-- /.row -->
          <div class="row">
            <div class="col-md-12">
              <div class="responsive">
                <div class="main-menu">
                  <ul>
                    <li><a href=""""),_display_(/*36.35*/routes/*36.41*/.Application.index),format.raw/*36.59*/("""#front">Home</a></li>
                    <li><a href=""""),_display_(/*37.35*/routes/*37.41*/.Application.index),format.raw/*37.59*/("""#services">Services</a></li>
                    <li><a href=""""),_display_(/*38.35*/routes/*38.41*/.Application.index),format.raw/*38.59*/("""#career">Careers</a></li>
                    <li><a href=""""),_display_(/*39.35*/routes/*39.41*/.Application.blog),format.raw/*39.58*/("""">Blog</a></li>
                    <li><a href=""""),_display_(/*40.35*/routes/*40.41*/.Application.index),format.raw/*40.59*/("""#about">About</a></li>
                    <li><a href=""""),_display_(/*41.35*/routes/*41.41*/.Application.index),format.raw/*41.59*/("""#contact">Contact</a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div> <!-- /.container -->
      </div> <!-- /.site-header -->
    </div>
  </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Wed Jun 22 18:27:52 NPT 2016
                  SOURCE: /home/ujjwal/csrdc/app/views/header.scala.html
                  HASH: 4339b54a5426bdafc97e98a099218351237c33fa
                  MATRIX: 611->0|1291->653|1306->659|1345->677|1426->731|1441->737|1480->755|1568->816|1583->822|1622->840|1707->898|1722->904|1760->921|1835->969|1850->975|1889->993|1971->1048|1986->1054|2025->1072|2413->1433|2428->1439|2467->1457|2550->1513|2565->1519|2604->1537|2694->1600|2709->1606|2748->1624|2835->1684|2850->1690|2888->1707|2965->1757|2980->1763|3019->1781|3103->1838|3118->1844|3157->1862
                  LINES: 25->1|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|60->36|60->36|60->36|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41
                  -- GENERATED --
              */
          