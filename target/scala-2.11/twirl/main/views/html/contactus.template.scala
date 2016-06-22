
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contactus_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class contactus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <title></title>
  <script>
      var myCenter=new google.maps.LatLng(27.6844899,85.3353435);
    function initialize()"""),format.raw/*8.26*/("""{"""),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""var mapProp = """),format.raw/*9.19*/("""{"""),format.raw/*9.20*/("""
      """),format.raw/*10.7*/("""center:myCenter,
      zoom:18,
      mapTypeId:google.maps.MapTypeId.ROADMAP
      """),format.raw/*13.7*/("""}"""),format.raw/*13.8*/(""";

    var map=new google.maps.Map(document.getElementById("map"),mapProp);

    var marker=new google.maps.Marker("""),format.raw/*17.39*/("""{"""),format.raw/*17.40*/("""
      """),format.raw/*18.7*/("""position:myCenter,
      animation:google.maps.Animation.BOUNCE
      """),format.raw/*20.7*/("""}"""),format.raw/*20.8*/(""");

    marker.setMap(map);
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""
    """),format.raw/*24.5*/("""google.maps.event.addDomListener(window, 'load', initialize);

  </script>
</head>
<body>
  <div id="contact" class="content-section">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center">
          <h1 class="section-title">Contact Us</h1>
        </div> <!-- /.col-md-12 -->
      </div> <!-- /.row -->
      <div class="row">
        <div class="col-md-offset-2 col-md-8 text-center bigger-text">
          <p>Computer Science Research and Development Center is located at Sankhamool - 34, Kathmandu, Nepal. </p>
          <br>
        </div>
        <div class="col-md-6 col-sm-6">
          <div id="map">
            <span class="glyphicon glyphicon-map-marker"></span> Sankhamool, Kathmandu &nbsp;&nbsp;
          </div>
        </div> <!-- /.col-md-6 -->
        <div class="col-md-6 col-sm-6">

          <div class="row contact-form">

            <fieldset class="col-md-12">
              <input id="name" type="text" name="name" placeholder="Name">
            </fieldset>
            <fieldset class="col-md-12">
              <input type="email" name="email" id="email" placeholder="Email">
            </fieldset>
            <fieldset class="col-md-12">
              <input type="text" name="subject" id="subject" placeholder="Subject">
            </fieldset>
            <fieldset class="col-md-12">
              <textarea name="comments" id="comments" placeholder="Message"></textarea>
            </fieldset>
            <fieldset class="col-md-12">
              <input type="submit" name="send" value="Submit" id="submit" class="button">
            </fieldset>

          </div> <!-- /.contact-form -->

        </div> <!-- /.col-md-6 -->
      </div> <!-- /.row -->
    </div> <!-- /.container -->
  </div> <!-- /#contact us -->
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
object contactus extends contactus_Scope0.contactus
              /*
                  -- GENERATED --
                  DATE: Wed Jun 22 11:28:10 NPT 2016
                  SOURCE: /home/ujjwal/csrdc/app/views/contactus.scala.html
                  HASH: bca48b3e389f4047127f21fbf34332e672a5c86c
                  MATRIX: 617->0|829->185|857->186|888->191|929->205|957->206|991->213|1102->297|1130->298|1273->413|1302->414|1336->421|1433->491|1461->492|1520->524|1548->525|1580->530
                  LINES: 25->1|32->8|32->8|33->9|33->9|33->9|34->10|37->13|37->13|41->17|41->17|42->18|44->20|44->20|47->23|47->23|48->24
                  -- GENERATED --
              */
          