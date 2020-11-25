class Lamp{
    private var isOn : Boolean = false
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun displayLightStatus(lamp : String){
        if(isOn){
            print("$lamp turned on")
        }
        else{
            print("$lamp turned off")
        }
    }
}