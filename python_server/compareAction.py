import requests
import json
import objectpath
import threading 
import time
import collections

def bigFunction(topic):
    response = requests.get("https://api.github.com/search/repositories?q="+topic+"&sort=stars&order=desc&per_page=100")
    data = response.json()

    if ('total_count' in data):
        numberOfRepositories = data['total_count']
        numberOfPages = int((numberOfRepositories/100)+1);
    
        array = []
        def function(fromNumber, toNumber):
            for i in range (fromNumber, toNumber):
                responseAux = requests.get("https://api.github.com/search/repositories?q="+topic+"&sort=stars&order=desc&per_page=100&page="+str(i))
                dataAux = responseAux.json()
                if (len(data["items"])!=0):
                    for j in range (0, 100):
                        array.append(data["items"][j]['full_name'])
                
        def functionForLastPage(pageNumber, numberOfRepo):
            responseAux = requests.get("https://api.github.com/search/repositories?q="+topic+"&sort=stars&order=desc&per_page=100&page="+str(pageNumber))
            dataAux = responseAux.json()
            if (len(data["items"])!=0):
                for j in range (0, numberOfRepo):
                    if (data["items"][j]['full_name'] in array) :
                        array.remove(data["items"][j]['full_name'])
                    else:
                        array.append(data["items"][j]['full_name'])
                    #print(data["items"][j]['full_name'])

        def onTime():
            number = int(numberOfPages/5)
            if (numberOfPages >5):
                thread1 = threading.Thread(target = function, args = [0,number],)
                thread2 = threading.Thread(target = function, args = [number,(number*2)+1],)
                thread3 = threading.Thread(target = function, args = [(number*2)+1,(number*3)+1],)
                thread4 = threading.Thread(target = function, args = [(number*3)+1,(number*4)+1],)
                thread5 = threading.Thread(target = function, args = [(number*4)+1,numberOfPages-1],)

                thread1.start()
                thread2.start()
                thread3.start()
                thread4.start()
                thread5.start()

                thread1.join()
                thread2.join()
                thread3.join()
                thread4.join()
                thread5.join()
            functionForLastPage(number, data['total_count'])
            return array

        return onTime()


