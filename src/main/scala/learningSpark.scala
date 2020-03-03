import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object learningSpark extends  App {

  val conf = new SparkConf().setAppName("WorkCount").setMaster("local")
  conf.set("spark.testing.memory", "2147480000")
  val sc = new SparkContext(conf)
  val line = sc.textFile("C:\\installerLog.txt")

  println("+++++++++++++++Total Line++++++++++++")
  println(line.count())
}
