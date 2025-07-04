version = 1 // Buradaki versiyon sabit de kalabilir ama isterseniz eklentideki sağlam değişiklikler sonrası yükseltebilirsiniz.

cloudstream {
    authors     = listOf("mooncrown04") // sizin paket adınız
    language    = "tr" // eklentinin dili
    description = "YakamozFilm sitesinden film izle keyfine bak" // depo içindeki eklentiler listelenirken tıklandığında görünmesi için kısa açıklama

    /**
     * Bu kısım eklentinin durumunu anlatmak için bilgi olarak var.
     * status= kısmına 0 derseniz down, 1 derseniz çalışıyor, 2 derseniz yavaş ve 3 derseniz deneme aşamasında olduğunu anlatır uygulamaya
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
    **/
    status  = 1 // Yukarıda açıkladım :))
    tvTypes = listOf("Movie") // Buradaki kısım eklentinin tipi. Eğer sadece film içinse Movie, dizi içinse TvSeries vb şeklinde düzenlenir.
    iconUrl = "https://www.google.com/s2/favicons?domain=www.yakamozfilm.latte&sz=%size%" // burada eklenti listesindeki simgesini direkt sitenin faviconunu alarak kullanmak için düzenleme yaparsınız. İsterseniz farklı bir görsel url adresi de verebilirsiniz.
}
