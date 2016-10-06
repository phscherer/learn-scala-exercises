class Executive {
  private[Executive] var secrets = null
  def help(another : Executive) {
      println(another.secrets) //ERROR
   }
}