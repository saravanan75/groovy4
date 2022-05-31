package module10



def connection = new URL("https://www.boredapi.com/api/activity").openConnection()
connection.setRequestProperty('Accept', 'application/json')
println(connection.inputStream.text)
