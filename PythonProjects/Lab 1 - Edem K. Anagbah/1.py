wind_speed = float(input("Enter wind speed in km/h:\n"))
air_temp = float(input("Enter air temperature in degrees celsius:\n"))

WCI = 13.12 + 0.6215 * air_temp - 11.37 * wind_speed**0.16 + 0.3965 * wind_speed * air_temp**0.16

print("Wind Chill Index:",round(WCI))
