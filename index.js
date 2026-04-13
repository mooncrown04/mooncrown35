const { addonBuilder } = require("stremio-addon-sdk");

// --- KANAL LİSTELERİ (METAS) ---
const ALL_METAS = {
  "cat_ulusal": [
    { id: "benimiptv:ATV.tr", name: "ATV", poster: "https://picon.pics/TR/Ulusal/Atv.png", type: "tv" },
    { id: "benimiptv:TRT1.tr", name: "TRT 1", poster: "https://picon.pics/TR/Ulusal/Trt1.png", type: "tv" },
    { id: "benimiptv:KanalD.tr", name: "Kanal D", poster: "https://i.ibb.co/hf2mSz5/kanal-d.png", type: "tv" },
    { id: "benimiptv:ShowTV.tr", name: "Show TV", poster: "https://upload.wikimedia.org/wikipedia/commons/f/f1/Logo_of_Show_TV.png", type: "tv" },
    { id: "benimiptv:StarTV.tr", name: "Star TV", poster: "https://picon.pics/TR/Ulusal/Startv.png", type: "tv" },
    { id: "benimiptv:TV8.tr", name: "TV8", poster: "https://picon.pics/TR/Ulusal/Tv8.png", type: "tv" }
  ],
  "cat_spor": [
    { id: "benimiptv:TRT.Spor.tr", name: "TRT Spor", poster: "https://cdn-i.pr.trt.com.tr/trttv/w750/h750/q100/13687983.png", type: "tv" },
    { id: "benimiptv:ASpor.tr", name: "A Spor", poster: "http://assets.tvcdn.net/14f4941c-00e7-4662-9a21-8203dc37b51a.png", type: "tv" },
    { id: "benimiptv:FBTV.tr", name: "Fenerbahçe TV", poster: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqzS70I58r2o70L-oPmTBqtL--C_sv4vR1Pw&s", type: "tv" },
    { id: "benimiptv:SPORSMART.tr", name: "Spor Smart", poster: "https://www.dsmart.com.tr/api/v1/public/images/kanallar/sporsmart.png", type: "tv" }
  ],
  "cat_haber": [
    { id: "benimiptv:HaberTurk", name: "Haber Türk", poster: "https://begenal.shop//resim/galeri_MTY0N_1582.png", type: "tv" },
    { id: "benimiptv:SozcuTV.tr", name: "Sözcü TV", poster: "http://assets.tvcdn.net/491384df-7154-4404-8f97-2e7847655441.png", type: "tv" },
    { id: "benimiptv:Halk TV.tr", name: "Halk TV", poster: "http://assets.tvcdn.net/f0bcd016-8730-4700-9156-d6b678f8e554.png", type: "tv" }
  ],
  "cat_sinema": [
    { id: "benimiptv:TRTNostalji", name: "TRT Nostalji", poster: "https://i.imgur.com/vLskrre.png", type: "tv" },
    { id: "benimiptv:FanatikYesilcam", name: "Fanatik Yeşilçam", poster: "https://i.imgur.com/uRovXp4.png", type: "tv" },
    { id: "benimiptv:Cine6Premier", name: "Cine6 Premier", poster: "https://i.imgur.com/pZ6mJjR.png", type: "tv" }
  ],
  "cat_belgesel": [
    { id: "benimiptv:NatGeoHD.tr", name: "National Geographic", poster: "https://feo.kablowebtv.com/resize/168A635D265A4328C2883FB4CD8FF/500/500/channels/logos/38a2e51a-9f7f-4915-aa88-f78190f59411.png", type: "tv" },
    { id: "benimiptv:TRTBelgeselHD.tr", name: "TRT Belgesel", poster: "https://picon.pics/TR/Documentary/Trtbelgesel.png", type: "tv" },
    { id: "benimiptv:TLC.tr", name: "TLC", poster: "https://img-tlctv.mncdn.com/logo.png", type: "tv" }
  ],
  "cat_muzik": [
    { id: "benimiptv:KralPopTV.tr", name: "Kral Pop TV", poster: "http://assets.tvcdn.net/61431fea-4103-46a3-9f8c-aad1504b9776.png", type: "tv" },
    { id: "benimiptv:PowerTurkTV.tr", name: "PowerTürk TV", poster: "http://assets.tvcdn.net/c866b6f0-00bd-40b9-9583-8cbdbe6a503e.png", type: "tv" }
  ],
  "cat_yerel": [
    { id: "benimiptv:KanalFirat", name: "Kanal Fırat", poster: "https://i.imgur.com/pZ6mJjR.png", type: "tv" },
    { id: "benimiptv:MercanTV", name: "Mercan TV", poster: "https://i.imgur.com/pZ6mJjR.png", type: "tv" }
  ]
};

// --- YAYIN LİNKLERİ (STREAMS) ---
const STREAMS = {
  "benimiptv:ATV.tr": "https://rnttwmjcin.turknet.ercdn.net/lcpmvefbyo/atv/atv.m3u8",
  "benimiptv:TRT1.tr": "https://trt.daioncdn.net/trt-1/master.m3u8?app=clean",
  "benimiptv:TRT.Spor.tr": "https://tv-trtspor1.medya.trt.com.tr/master_1080.m3u8",
  "benimiptv:KralPopTV.tr": "https://dogus-live.daioncdn.net/kralpoptv/kralpoptv.m3u8",
  "benimiptv:SozcuTV.tr": "https://raw.githubusercontent.com/tecotv2025/tecotv/refs/heads/main/playlist/Sozcu_Tv.m3u8",
  "benimiptv:TRTBelgeselHD.tr": "https://tv-trtbelgesel-dash.medya.trt.com.tr/master.mpd",
  // DİĞER TÜM LİNKLER BURAYA EKLENECEK...
};

const builder = new addonBuilder(require("./manifest.json"));

// 1. Katalog İşleyici (Kategori tıklandığında listeyi döner)
builder.defineCatalogHandler(({ id }) => {
  return Promise.resolve({ metas: ALL_METAS[id] || [] });
});

// 2. Meta İşleyici (Arama veya detay için)
builder.defineMetaHandler(({ id }) => {
  const allMetasFlat = Object.values(ALL_METAS).flat();
  const meta = allMetasFlat.find(m => m.id === id);
  return Promise.resolve({ meta: meta || null });
});

// 3. Yayın İşleyici (Kanal tıklandığında linki döner)
builder.defineStreamHandler(({ id }) => {
  if (STREAMS[id]) {
    return Promise.resolve({
      streams: [{ title: "Canlı Yayın", url: STREAMS[id] }]
    });
  }
  return Promise.resolve({ streams: [] });
});

module.exports = builder.getInterface();
