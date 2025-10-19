class Solution
{
    
    func
    convertTemperature
    (
        celsius: Float64
    )
    : Array < Float64 >
    {
        let kelvin: Float64 = celsius + 273.15f64
        let fahrenheit: Float64 = ( celsius * 1.8f64 ) + 32.0f64
        
        
        return [ kelvin, fahrenheit ]
    }
    
}
