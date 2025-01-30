# Kesikli Sırt Çantası Problemi
Bu problem Kesirli Sırt Çantası Problemi (Fractional Knapsack Problem) olarak bilinir ve Greedy (Açgözlü) Algoritma ile çözülür. Mantık şu şekildedir:

1-) **Eşyaları Birim Değerine Göre Sırala** <br/>
    Birim değer (değer/ağırlık) hesaplanır ve büyükten küçüğe sıralanır.

2-) **Çantaya En Değerli Olanları Ekleyerek Devam Et** <br/>
    Kapasite dolana kadar en yüksek birim değere sahip eşyaları tamamen ekle, kapasite yetmezse parçalı ekle.

<hr/>

Knapsack probleminde iki tür durum vardır:

1-) **0/1 Knapsack (Bütün eşyalar ya alınır ya alınmaz)** → Greedy her zaman optimal vermez. <br/>
2-) **Kesirli Knapsack (Eşyaların bir kısmı alınabilir)** → Greedy her zaman optimaldir. <br/> <br/>
<hr/>

## Nasıl Çalışır ? <br/> 
*Kesikli sırt çantası probleminin nasıl çalıştığını aşağıdaki soru üzerinde daha detaylıca inceleyelim;* <br/> <br/>
<img width="730" alt="Soru" src="https://github.com/user-attachments/assets/64bc1a74-18cb-4d26-9610-b7607115760e" /> <br/> <br/>
<img width="730" alt="Çözüm1" src="https://github.com/user-attachments/assets/bb5632ad-5c66-448e-a6dc-2df862c92014" /> <br/> <br/>
<img width="730" alt="Çözüm2" src="https://github.com/user-attachments/assets/ef710977-bc31-4458-85ef-ac70d94eb403" /> <br/> <br/>

### Çıktı <br/> 
<img width="730" alt="output" src="https://github.com/user-attachments/assets/0d128d04-94dd-4405-8339-f538774be3f8" />
