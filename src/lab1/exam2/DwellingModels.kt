package lab1.exam2

abstract class Dwelling {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

open class RoundHut(val residents: Int) : Dwelling() {
    override val buildingMaterial = "Straw"

    override fun floorArea(): Double {
        return 50.0
    }
}

class SquareCabin(val floors: Int) : RoundHut(6) {
    override val buildingMaterial = "Wood"

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}
