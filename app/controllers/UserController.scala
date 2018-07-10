package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.i18n.{MessagesApi, I18nSupport}
import javax.inject.Inject
import scalikejdbc._
import models._

class UserController @Inject()(val messagesApi: MessagesApi) extends Controller
  with I18nSupport {

  /**
    * 一覧表示
    */
  def list = Action { implicit request =>
    val u = Users.syntax("u")

    DB.readOnly { implicit session =>
      // ユーザのリストを取得
      val users = withSQL {
        select.from(Users as u).orderBy(u.id.asc)
      }.map(Users(u.resultName)).list.apply()

      // 一覧画面を表示
      Ok(views.html.user.list(users))
    }
  }

  /**
    * 編集画面表示
    */
  def edit(id: Option[Long]) = TODO

  /**
    * 登録実行
    */
  def create = TODO

  /**
    * 更新実行
    */
  def update = TODO

  /**
    * 削除実行
    */
  def remove(id: Long) = TODO

}
