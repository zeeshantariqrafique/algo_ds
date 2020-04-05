package com.algo.ds.scala

import scala.io.Source
import scala.collection.mutable.HashMap
object FileReadStore {
  def main(args: Array[String]) {

    //read and store the lines of file in an array
    val lines = Source.fromFile("data.txt").getLines().toList

    //create an mutable Hashmap **as we need to change the values in map later**
    var m: HashMap[String, Int] = scala.collection.mutable.HashMap()

    //for each line in the file
    lines.foreach(i =>
      //For each word in line
      i.split(" ").foreach(w =>
        //Check if we have seen this word before in the file
        if (m.contains(w))
          //If this word is seen before in file increment count value
          m(w) += 1
        else //If first time we see this word in file , Store it
          m(w) = 1));
    //Print the stored words and its count
    println(m.keys.foreach(i => println(i + " : " + m(i))));
  }
}