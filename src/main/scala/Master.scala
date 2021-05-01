import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Master {

  def main(args: Array[String]): Unit = {

    println("Hello Scala")
    val sparkConf = new SparkConf()
      .setAppName("dheeraj-spark-demo")
      .setMaster("local[1]")
    val sparkContext = new SparkContext(sparkConf)
    val data = Array(1, 2, 3, 4, 5)
    val rdd  = sparkContext.parallelize(data)
    rdd.foreach(item=>{
     println("Item from array "+item)
    })
    println("Thank you Spark")
  }
}