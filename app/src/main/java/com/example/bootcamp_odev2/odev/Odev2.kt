package com.example.bootcamp_odev2.odev

class Odev2 {

    // 1.parametre olarak girilen kilometreyi...
    fun kmToMil(km:Double) : Double{
        return km*0.621
    }

    // 2.kenarları parametre olarak girilen dikdörtgen alanı..,
    fun dikdortgenAlanHesapla(en:Int,boy:Int) : Int{
        return en * boy
    }

    //3. faktoriyel hesaplama
    fun faktoriyelHesapla(sayi : Int) : Int{
        var indice=sayi
        var sonuc =1

        while (indice>0){
            sonuc *= indice
            indice--
        }

        return sonuc
    }

    // 4. parametre olarak girilen kelime içindeki e harfini saydır
    fun eHarfiniSay(query:String) : Int {
        var say=0

        query.forEach {
            if (it == 'e'  || it == 'E'){
                say +=1
            }
        }

        return say
    }

    // 5. parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayan..
    fun aciHesapla(kenarSayisi:Int) : Int{
        return ((kenarSayisi-2)*180)/kenarSayisi
    }

    // 6. parametre olarak girilen gün sayısına göre maaş hesabı
    fun maasHesapla(calisilanGun:Int) : Int{
        var kacSaatCalisti = calisilanGun*8
        val saatUcreti = 40
        val mesaiUcreti = 80
        var toplamEkMesaiSaati = 0
        var toplamUcret = 0

        //mesaisini hesaplayıp mesai ücretini eklicem
        if (kacSaatCalisti>150){
            toplamEkMesaiSaati += kacSaatCalisti-150
            kacSaatCalisti -= toplamEkMesaiSaati
            toplamUcret += (toplamEkMesaiSaati * mesaiUcreti) + (kacSaatCalisti * saatUcreti)
        }
        else{
            toplamUcret += kacSaatCalisti*saatUcreti
        }

        return toplamUcret
    }

    // 7. Otopark süresine göre otopark ücreti hesaplayan...
    fun otoparkUcretHesapla(saat:Int) : Int{

        val ucretHesapla = if (saat>1){
             50+ ((saat-1) *10)
        }else if (saat == 1){
              50
        } else {
              0
        }
        return  ucretHesapla
    }

    //private fun Int.pow() : Int{
    //        return this*this
    //    }
}