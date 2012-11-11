package cz.mencik.scaladi.guice.example.impl
import cz.mencik.scaladi.guice.example.HotWater

import cz.mencik.scaladi.guice.example.WaterHeater

class FastWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(20)

}

class SlowWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(300)

}