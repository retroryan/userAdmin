package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your old application is ready."))
  }

  def admin() = play.mvc.Results.TODO
}