# (21) Post Processor & Understanding Jmeter Results

## Definisi Post Processor
Post processor adalah komponen yang digunakan setelah pengujian untuk memproses dan menganalisis data respons dari server atau aplikasi yang diuji.


## Throughput
```
Throughput = (number of requests) / (total time) * conversion
```

Where:
```
number of request = number of executed requests
total time = (lastSampleStartTime + lastSampleLoadTime - firstSampleStartTime)
conversion: the unit of conversion value example 1000 will convert the value to the second (1000*60)
```