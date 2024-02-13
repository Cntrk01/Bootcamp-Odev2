package com.example.bootcamp_odev2.odev

fun main() {
    val odev2=Odev2()

    // 1.parametre olarak girilen kilometreyi...
    println("Km To Mil : "+ odev2.kmToMil(10.2))

    // 2.kenarları parametre olarak girilen dikdörtgen alanı..,
    println("Dikdörtgen Alanı : "+ odev2.dikdortgenAlanHesapla(10,6))

    //3. faktoriyel hesaplama
    println("Faktöriyel : "+ odev2.faktoriyelHesapla(10))

    // 4. parametre olarak girilen kelime içindeki e harfini saydır
    println("E Harfi Sayısı : " + odev2.eHarfiniSay("MehmEt"))

    // 5. parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayan..
    println("İç Açı Hesabı : " +odev2.aciHesapla(4))

    // 6. parametre olarak girilen gün sayısına göre maaş hesabı
    println("Maaş Sonucu : " + odev2.maasHesapla(18))

    // 7. otopark ücreti hesaplama
    println("Otopark Ücreti : " + odev2.otoparkUcretHesapla(5))
}