package com.example.myapplication

object SumatraFood
{
    private val foodNames = arrayOf("Kacimuih",
        "Gajeboh",
        "Sate Padang",
        "Rendang",
        "Soto Padang")
    private val foodPhotos = intArrayOf(R.drawable.kacimuih,
        R.drawable.gajeboh,
        R.drawable.satepadang,
        R.drawable.rendang,
        R.drawable.sotopadang)
    private val detailFood = arrayOf(
        "Kacimuih adalah jajanan tradisional Orang Minangkabau yang dibuat dari perpaduan Ketela pohon dan parutan Kelapa." +
                "Kacimuih disajikan dengan taburan Gula untuk menambah rasa. Gula yang dipakai bisa gula pasir maupun gula " +
                "merah (Gula aren). Kacimuih memiliki tekstur yang lunak dengan rasa yang gurih. Rasa gurih berasal dari " +
                "parutan kelapa yang telah ditaburi gula.\n" +
                "\n" +
                "Bahan\n" +
                "1/2 kg singkong\n" +
                "1/2 butir kelapa parut\n" +
                "Sejumput garam\n" +
                "Secukupnya gula merah\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Kupas singkong, cuci bersih kemudian parut kasar\n" +
                "2. Taburi kelapa parut dengan sedikit garam halus, aduk dan kukus\n" +
                "3. Potong-potong daun pisang bentuk persegi empat selebar telapak tangan.\n" +
                "4. Ambil 3-4 singkong parut letakkan tumpuk di potongan daun pisang, lakukan berulang hingga semua singkong parut habis kemudian kukus hingga matang.\n" +
                "5. Ambil kacimuih yang sudah matang kemudian taburi kelapa parut yang sudah dikukus serta taburi gula pasir di atasnya.",
        "Gajebo, atau Gajeboh atau Gulai Gajebo atau Sampade daging, adalah makanan khas Sumatra Barat. Makanan ini biasanya" +
                " menggunakan bahan sandung lamur yang merupakan bagian daging sapi yang hampir semuanya terdiri dari lemak " +
                "kenyal (yang berada di bagian punuk sapi).\n" +
                "\n" +
                "Bahan\n" +
                "1 kg daging sapi bagian punuk(berlemak)\n" +
                "1 lembar daun kunyit\n" +
                "3 batang serai\n" +
                "6 lembar daun jeruk purut\n" +
                "2 buah asam kindis\n" +
                "500 ml air\n" +
                "20 buah bawang merah\n" +
                "12 siung bawang putih\n" +
                "16 butir kemiri\n" +
                "3 cm jahe\n" +
                "3 cm laos\n" +
                "5 cm kunyit(bakar)\n" +
                "1/2 sdt lada bubuk\n" +
                "1 sdt gula pasir\n" +
                "8 buah cabe rawit\n" +
                "20 buah cabe kering(rendam air panas supaya lunak)\n" +
                "Secukupnya garam\n" +
                "Secukupnya penyedap rasa(bila suka)\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih daging sapi, potong potong sesuai selera. Masukkan ke dalam kuali.\n" +
                "2. Haluskan bumbu (bisa menggunakan blender). Campurkan dengan daging sampai merata." +
                "\tDiamkan campuran daging dan bumbu di dalam kuali selama 60 menit, supaya bumbu meresap." +
                "\tTutup panci supaya terjaga kebersihannya\n" +
                "3. Masak daging dengan api kecil sampai tekstur daging berubah kaku (kurang lebih 4 menit).\n" +
                "4. Masukkan 500 ml air, daun kunyit (robek robek), daun jeruk, serai, aduk merata. Tutup kuali. " +
                "\tTeruskan memasak dengan api kecil (kira kira 1 jam 25 menit)\n" +
                "5. Masukkan asam kandis, teruskan memasak sampai daging dan lemak empuk (kira kira 20 menit)\n",
        "Sate Padang memakai bahan daging sapi, lidah, atau jerohan (jantung, usus, dan tetelan) dengan bumbu kuah kacang " +
                "kental (mirip bubur) ditambah cabai yang banyak sehingga rasanya pedas.\n" +
                "\n" +
                "Bahan\n" +
                "400 gr daging ayam fillet\n" +
                "2 biji cengkeh\n" +
                "1 biji bunga lawang\n" +
                "3 biji kapulaga\n" +
                "1 helai daun kunyit\n" +
                "3 batang serai\n" +
                "3 cm lengkuas\n" +
                "100 gr tepung beras\n" +
                "1 sdm cabai kriting halus\n" +
                "1 1/2 sdt cabai rawit halus\n" +
                "3 sdm bawang putih cincang\n" +
                "6 sdm bawang merah cincang\n" +
                "1/2 butir pala\n" +
                "2 sdm bubuk kari\n" +
                "2 sdm bubuk kunyit\n" +
                "2 sdm ketumbar bubuk\n" +
                "4 cm jahe\n" +
                "1/2 sdm garam\n" +
                "1 sdt merica bubuk\n" +
                "3 cm kayu manis\n" +
                "1/2 sdt jinten\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Potong kotak daging ayam sisihkan\n" +
                "2. Tumis bumbu halus sampai harum lalu masukkan bahan lain daun kunyit,serai dan rempah lainnya.\n" +
                "3. Tambahkan sedikit air\n" +
                "4. Masukkan potongan kotak daging ayam\n" +
                "5. Angkat lalu tusuk daging ayam dengan tusuk sate. Sisihkan dan simpan bumbu tumisan\n" +
                "6. Tuang 650 ml air ke dalam panci lalu masukkan sisa bumbu\n" +
                "7. Tuang tepung beras sembari diaduk cepat agar tidak menggumpal\n" +
                "8. Bakar sate di teflon lalu hidangkan dengan irisan lontong, bawang goreng",
        "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan" +
                " dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.\n" +
                "\n" +
                "Bahan\n" +
                "250 gram daging sapi\n" +
                "100 gram cabe halus\n" +
                "4 butir kemiri\n" +
                "4 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "2 cm jahe\n" +
                "2 cm kunyit\n" +
                "600 ml santan kental\n" +
                "1/4 sdt jinten\n" +
                "3 buat cengkeh\n" +
                "1/2 sdt ketumbar\n" +
                "2 cm kayu manis\n" +
                "1 potong kecil adas manis\n" +
                "10 butir lada putih\n" +
                "1 batang sereh\n" +
                "2 cm lengkuas\n" +
                "1 sdt garam\n" +
                "1/2 sdt gula pasir\n" +
                "5 sdm minyak untuk menumis\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Iris bawang merah dan bawang putih.\n" +
                "2. Haluskan bumbu lainnya kecuali kayu manis, adas manis, sereh dan cengkeh\n" +
                "3. Ambil 1 sdm cabe halus lalu campurkan ke daging, aduk rata.\n" +
                "4. Tumis bawang merah dan bawang putih iris.\n" +
                "5. Masukkan daging yang sudah dicampur cabai halus, aduk sampai tercampur rata.\n" +
                "6. Masukkan santan encer sebanyak 1 liter, masak dan sesekali diaduk sampai mendidih dan santan tinggak setengahnya.\n" +
                "7. Masukkan semua sisa bumbu dan aduk sampai tercampur rata.\n" +
                "8. Tambahkan 1 liter santan encer lagi dan masak terus sampai santan tinggal sedikit kemudian masukkan 1/2 liter santan " +
                "\tkental, masak terus sambil diaduk sampai mengering. (Kalau daging masih keras bisa ditambahkan air panas secukupnya dan " +
                "\tmasak terus sampai daging lunak).",
        "Soto Padang menggunakan potongan daging sapi yang digoreng. Ciri khas lainnya adalah adanya perkedel dan kerupuk berwarna merah" +
                " jambu sebagai pelengkap. Soto Padang memiliki cita rasa gurih yang berasal dari kaldu sapi. Selain itu, soto ini juga disajikan" +
                " bersama dengan soun dan irisan tomat. Untuk menambah kelezatannya, Anda juga bisa menambahkan irisan jeruk nipis.\n" +
                "\n" +
                "Bahan\n" +
                "400 gram daging sapi\n" +
                "2 batang daun bawang\n" +
                "1 batang seledri\n" +
                "1 sdt kaldu bubuk\n" +
                "1/2 sdt garam\n" +
                "2 liter air\n" +
                "Secukupnya minyak goreng\n" +
                "3 siung bawang putih\n" +
                "8 butir bawang merah\n" +
                "2 cm jahe\n" +
                "4 cm lengkuas\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Dalam panci, rebus daging sapi dengan sedikit air sampai mendidih dan keluar busa kotorannya. Ambil dan buang kotoran yang mengapung. " +
                "\tMatikan api lalu buang air bekas rebusannya. Tiriskan daging lalu cuci kembali hingga bersih. Sisihkan.\n" +
                "2. Dalam panci, rebus 2 liter air baru. Masukkan daging, daun bawang, dan seledri. Masak hingga daging empuk. Angkat daging dan tiriskan. " +
                "\tSementara itu, terus lanjutkan merebus kuah. Sisihkan.\n" +
                "3. Panaskan sedikit minyak Tumis bumbu halus lalu matikan api\n" +
                "4. Tuang tumisan bumbu ke dalam panci rebusan. Bumbui dengan kaldu bubuk dan garam. Masak kuah hingga mendidih lalu koreksi rasanya. Matikan api. Sisihkan.\n" +
                "5. Ambil daging, lalu potong jadi dadu kecil atau iris tipis. Goreng daging dalam minyak panas sampai kering. Angkat dan tiriskan. Sisihkan.\n" +
                "6. Tata soun, tomat, daging goreng, dan perkedel kentang dalam mangkok saji. Siram dengan kuah. Taburi dengan bawang goreng dan beri kerupuk pink.\n" +
                "7. Siap disajikan dengan sambal dan irisan jeruk nipis."
    )

    val listDataSumatera: ArrayList<DataSumateraFood>
    get() {
        val list = arrayListOf<DataSumateraFood>()
        for (position in foodNames.indices)
        {
            val food = DataSumateraFood()
            food.name = foodNames[position]
            food.photo = foodPhotos[position]
            food.detail = detailFood[position]
            list.add(food)
        }
        return list
    }
}
object JawwaFood
{
    private val foodNames = arrayOf("Gudeg",
        "Gethuk",
        "Nasi Liwet",
        "Rujak Cingur",
        "Mie Lethek")
    private val foodPhotos = intArrayOf(R.drawable.gudeg,
        R.drawable.gethuk,
        R.drawable.nasiliwet,
        R.drawable.rujakcingur,
        R.drawable.mielethek)
    private val detailFood = arrayOf(
        "Gudeg adalah masakan tradisional Jawa dari Yogyakarta dan Jawa Tengah, Indonesia. Dalam perkembangannya, masyarakat mengenal gudeg terkenal berasal dari Yogyakarta sehingga membuat kota ini dikenal dengan nama Kota Gudeg." +
                "Gudeg terbuat dari nangka muda mentah (Jawa: gori). Direbus selama beberapa jam dengan gula aren, dan santan rempah-rempah tambahan termasuk bawang putih, bawang merah, kemiri, biji ketumbar, lengkuas, daun salam, " +
                "dan daun jati, yang memberikan warna coklat kemerahan ke masakan.\n" +
                "\n" +
                "Bahan\n" +
                "600 gr Nangka muda\n" +
                "Air secukupnya untuk merebus nangka\n" +
                "3 lembar daun jati atau ganti dengan 2 sachet teh celup atau 3 sdm kulit bawang merah\n" +
                "4 butir telur ayam rebus\n" +
                "1 liter santan cair atau 400 ml santan kental dicampur dengan 600 ml air\n" +
                "400 ml santan sangat kental\n" +
                "2 lembar daun salam\n" +
                "3 cm lengkuas\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Masukkan daun jati / kulit bawang merah / teh celup di alas panci perebus\n" +
                "2. Masukkan potongan nangka beserta air sampai semua nangka terendam\n" +
                "3. Tiriskan nangka, buang air rebusan\n" +
                "4. Haluskan semua bahan bumbu halus dengan cobek atau blender. Jika perlu " +
                "tambahkan sedikit santan ke dalam blender untuk mempermudah proses penghancuran.\n" +
                "5. Taruh nangka rebus/nangka kalengan ke dalam panci, masukkan bumbu halus, daun salam, " +
                "lengkuas dan santan encer. Masak dengan api sedang hingga mendidih\n" +
                "6. Setelah mendidih, masukkan telur rebus dan santan kental, masak dengan api sedang hingga " +
                "santan menyusut dan bumbu meresap. Aduk2 supaya santan tidak pecah.",
        "Getuk adalah  makanan ringan yang terbuat dengan bahan utama ketela pohon atau singkong. Getuk merupakan makanan yang mudah ditemukan di Jawa Tengah dan Jawa Timur. Pembuatan getuk diawali dengan singkong dikupas kemudian kukus " +
                "atau perebusan, setelah matang kemudian ditumbuk atau dihaluskan dengan cara digiling lalu diberi pemanis gula dan pewarna makanan. Untuk penghidangan biasanya ditaburi dengan parutan buah kelapa.\n" +
                "\n" +
                "Bahan\n" +
                "1 kg singkong\n" +
                "120 gr gula merah\n" +
                "50 gr gula pasir\n" +
                "Secukupnya vanili\n" +
                "Secukupnya garam\n" +
                "Secukupnya kelapa parut\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Kupas singkong lalu cuci dan potong kecil - kecil lalu kukus sampai empuk.\n" +
                "2. Setelah matang haluskan singkong bersama gula merah dan gula putih, garam, vanili, lalu tumbuk sampai gula tercampur rata.\n" +
                "3. Siapkan loyang yang sudah dialasi plastik, ratakan adonan singkong dan sedikit ditekan agar padat\n" +
                "4. Lalu pindahkan ke loyang datar dan getuk siap dipotong",
        "Nasi Liwet adalah  makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. " +
                "Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur " +
                "labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa).\n" +
                "\n" +
                "Bahan\n" +
                "1. 4 cup beras\n" +
                "2. 2 batang sereh\n" +
                "3. 2 lembar daun salam\n" +
                "4. 5 siung bawang merah\n" +
                "5. 3 siung bawang putih\n" +
                "6. 1 genggam teri\n" +
                "7. 2 biji cabe merah besar\n" +
                "8. Secukupnya garam\n" +
                "9. Secukupnya kaldu bubuk\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih beras,kemudian tempatkan pada rice cooker\n" +
                "2. Goreng teri hingga coklat keemasan,sisihkan.\n" +
                "3. Iris tipis duo bawang & iris serong cabe merah besar.\n" +
                "4. Tumis bawang dan cabe merah hingga harum.tambahkan sereh simpul yang sudah digeprek dan daun salam\n" +
                "5. Masukkan teri goreng.tumis sebentar,kmudian masukkan tumisan tadi kedalam beras yang sudah dicuci bersih.\n" +
                "6. Tambahkan air sebanyak takaran ketika memasak nasi biasanya.\n" +
                "7. Tambahkan garam dan kaldu bubuk\n" +
                "8. Setelah matang, bisa langsung diaduk supaya rasa lebih merata",
        "Rujak cingur adalah salah satu makanan tradisional yang mudah ditemukan di daerah Jawa Timur, terutama daerah asalnya Surabaya. " +
                "Dalam bahasa Jawa kata cingur berarti \"mulut\", hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan " +
                "dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan beberapa jenis buah seperti timun, kerahi (krai, yaitu " +
                "sejenis timun khas Jawa Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang.\n" +
                "\n" +
                "Bahan\n" +
                "1/4 ikat kangkung\n" +
                "100 gr taoge\n" +
                "4 buah timun\n" +
                "250 gr cingur sapi\n" +
                "1 buah tahu\n" +
                "1/2 papan tempe\n" +
                "2 buah lontong ukuran kecil\n" +
                "\n" +
                "Bumbu Perendam Cingur\n" +
                "2 siung bawang putih\n" +
                "1/2 sdt ketumbar\n" +
                "Secukupnya garam\n" +
                "\n" +
                "Bumbu yang dihaluskan\n" +
                "10 buah cabe rawit merah\n" +
                "1 sachet terasi\n" +
                "1/2 buah pisang batu\n" +
                "8 sdm kacang tanah goreng\n" +
                "200 gr gula merah\n" +
                "1 sdt asam jawa\n" +
                "8 sdm petis udang\n" +
                "Secukupnya garam\n" +
                "Secukupnya air\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih semua sayuran kemudian tiriskan.\n" +
                "2. Cuci bersih cingur sapi kemudian tiriskan. Kemudian rendam dalam bumbu perendam selama 15 menit. Setelah itu goreng dalam minyak panas hingga matang, angkat dan tiriskan. Potong-potong kecil. Sisihkan.\n" +
                "3. Rebus kangkung dan taoge hingga matang, angkat lalu tiriskan dan sisihkan.\n" +
                "4. Diatas cobek besar haluskan cabe rawit merah, terasi, kacang goreng, asam jawa, gula merah, pisang batu, garam hingga halus. Kemudian tambahkan petis giling lagi sampai tercampur rata. Setelah itu tambahkan air, aduk hingga bumbu tercampur rata.\n" +
                "5. Setelah bumbu tercampur rata, masukkan kangkung, timun, taoge, tahu, tempe, cingur dan lontong. Aduk sampai semua tercampur secara merata.\n" +
                "6. Tata diatas piring saji dan tambahkan kerupuk sebagai pelengkap.",
        "Mi letheg atau Mi Lethek, adalah salah satu kuliner mie yang berasal dari Srandakan, Bantul, Yogyakarta dengan menggunakan bahan dasar tepung tapioka dan singkong.\n" +
                "\n" +
                "Bahan\n" +
                "2 bongkah mie lethek\n" +
                "1 butir telur\n" +
                "1/4 buah kol\n" +
                "1/2 buah wortel\n" +
                "1 batang daun bawang\n" +
                "1 batang seledri\n" +
                "Secukupnya bawang goreng\n" +
                "1 sdt kaldu ayam\n" +
                "1 sdt kecap manis (optional)\n" +
                "\n" +
                "Bumbu\n" +
                "2 siung bawang putih\n" +
                "1/4 sdt merica butiran\n" +
                "1 butir kemiri\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Rendam mie lethek di air biasa hingga mekar. Tiriskan jika sudah cukup lunak. Waktu yang dibutuhkan kurang lebih 15 menit\n" +
                "2. Sementara menunggu mie, siapkan bahan-bahan yang lain.\n" +
                "3. Tumis bumbu yang telah dihaluskan hingga layu dan harum\n" +
                "4. Tambahkan kol, wortel dan juga seledri\n" +
                "5. Setelah mie siap, masukkan mie tersebut bersama dengan bawang goreng\n" +
                "6. Berikan 1 sdt kaldu ayam dan mie lethek pun siap disajikan"
    )

    val listDataJawa: ArrayList<DataJawaFood>
    get() {
        val list = arrayListOf<DataJawaFood>()
        for (position in foodNames.indices)
        {
            val food = DataJawaFood()
            food.name = foodNames[position]
            food.photo = foodPhotos[position]
            food.detail = detailFood[position]
            list.add(food)
        }
        return list
    }
}
object KalimntanFood
{
    private val foodNames = arrayOf("Ketupat Kandangan",
        "Chai Kue",
        "Mandai",
        "Pengkang",
        "Hekeng")
    private val foodPhotos = intArrayOf(R.drawable.ketupatkandangan,
        R.drawable.chaikue,
        R.drawable.manday,
        R.drawable.pengkang,
        R.drawable.hekeng)
    private val detailFood = arrayOf(
        "Ketupat Kandangan merupakan kuliner khas yang berasal dari daerah Kandangan, Kalimantan Selatan. Seperti ketupat pada umumnya, bahan untuk membuat " +
                "ketupat berasal dari beras. Perbedaan ketupat Kandangan dengan jenis ketupat lainnya adalah penggunaan ikan gabus (haruan) sebagai menu pelengkap.\n" +
                "\n" +
                "Bahan\n" +
                "8 potong ikan haruan (gabus) sudah dipanggang\n" +
                "12 buah ketupat siap makan\n" +
                "Secukupnya bawang goreng\n" +
                "1 kg kelapa parut\n" +
                "1 butir telur\n" +
                "\n" +
                "Bumbu\n" +
                "2 ujung jari kencur\n" +
                "6 butir kemiri\n" +
                "2 ibu jari jahe\n" +
                "12 siung bawang merah\n" +
                "7 siung bawang putih\n" +
                "3 buah cabe kering\n" +
                "2 ruas sereh\n" +
                "1 ruas lengkuas\n" +
                "3 liter air\n" +
                "Secukupnya garam dan penyedap\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan kelapa parut dalam baskom,masukan telur (hintalu) dan 2 1/2 liter air aduk sambil diremas-remas lalu peras dan saring santannya.\n" +
                "2. Masak santan bersama sereh dan lengkuas sambil di aduk perlahan,sebelum mendidih masukan bumbu yang di haluskan,dan cabe kering,aduk pelan agar" +
                " santan tidak pecah tambahklan garam,penyedap\n" +
                "3. Setelah mendidih aduk-aduk terus dengan api sedang beberapa saat.setelah matang matikan apinya biarkan sampai sari santan mengapung\n" +
                "4. Ambil menggunakan saringan teh, pisahkan sari santan kentalnya pisahkan di wadah mankuk,sisihkan\n" +
                "5. Didihkan kembali kuah santan,masukan ikan haruan/gabus panggangnya dan hintalu rebus jika suka,.aduk-aduk sebentar pelan saja llalu angkat.\n" +
                "6. Siapkan potongan ketupat di piring saji,beri sepotong ikan haruan,tuang kuah santan secukupnya saja tambahkan sedikit sari santan yang di pisahkan tadi tambahkan hintalu,taburi bawang goreng\n" +
                "7. Ketupat kandangan siap disajikan",
        "Chai kue atau choi pan merupakan hidangan Tionghoa asal Kalimantan Barat. Sepintas bentuknya mirip dengan pastel atau kroket, tetapi pengolahannya berbeda, jika pastel dan kroket harus digoreng terlebih dahulu, " +
                "maka chai kue harus dikukus sebelum disajikan. Isi chai kue dapat berupa bengkuang, talas, maupun kucai. Kulit chai kue yang tipis terbuat dari tepung beras dengan pelengkap bawang goreng di atasnya.\n" +
                "\n" +
                "Bahan\n" +
                "100 gram tepung beras\n" +
                "25 gram tepung sagu\n" +
                "2 sendok makan minyak goreng\n" +
                "Secukupnya garam\n" +
                "200 ml air\n" +
                "Secukupnya bengkuang\n" +
                "Secukupnya keladi\n" +
                "Secukupnya kucai\n" +
                "Secukupnya udang\n" +
                "Secukupnya bawang putih\n" +
                "Secukupnya lada\n" +
                "Secukupnya garam\n" +
                "Secukupnya bawang putih\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan untuk bahan isinya terlebih dahulu, cuci bersih kucai potong ukuran 3 cm, kupas bengkuang bersihkan dan parut dengan parutan rujak, rebus keladi dan parut juga\n" +
                "2. Lalu tumis masing - masing isian tersebut dengan bumbu yang telah dihaluskan dahulu yaitu Ebi, bawang putih dan lada dan bubuhi garam secukupnya. (menumisnya masing-masing Bengkuang sendiri, keladi sendiri dst)\n" +
                "3. Setelah ditumis tiriskan isian tadi agar saat diisikan ke kulit tidak byk mengandung air.\n" +
                "4. Mulailah membuat kulit ambil sejumput adonan pipihkan berbentuk lingkaran dengan diameter 6-7 cm lalu isi kemudian tutup seperti membuat pastel.\n" +
                "5. Siapkan kukusan lalu kukus selama 7 - 10 menit\n" +
                "6. Setelah matang bubuhi atasnya dengan minyak bawang putih",
        "Manday, atau Mandai, adalah salah satu jenis lauk alternatif dari daerah Kalimantan Selatan. Mandai disebut juga dengan Mandai Basang atau kulit buah Cempedak yang digoreng. Orang Banjar biasanya menyebut makanan dari kulit cempedak ini dengan Manday tetapi ada juga yang menyebutnya dengan Dami.\n" +
                "\n" +
                "Bahan\n" +
                "1 Biji buah tiwadak (Cempedak) matang\n" +
                "Secukupnya air\n" +
                "Secukupnya garam\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Kupas kulit buah dalam keadaan utuh (jangan di belah)\n" +
                "2. Kupas sampai semua kulitnya bersih. Agar getah tidak lengket pada pisau, sebelumnya lumuri pisau yang akan digunakan dengan minyak goreng, boleh juga lumuri pada tangan jika takut terkena getahnya yang lengket.\n" +
                "3. Kemudian belah memanjang buah cempedak\n" +
                "4. Buka kedua sisinya sampai buahnya terlepas dari kulitnya\n" +
                "5. Ambil dan sisihkan buah Cempedak ke mangkok lain\n" +
                "6. Lakukan sampai semua buah tidak menempel lagi pada daging kulitnya\n" +
                "7. Potong kecil kulit cempedak sesuai selera\n" +
                "8. Cuci bersih kulit cempedak dan pastikan tidak ada sisa buah muda yang masih menempel di sela selanya.Setelah di cuci lalu tiriskan.\n" +
                "9. Taburkan garam pada kulit cempedak, banyaknya garam tergantung banyaknya daging buah cempedak\n" +
                "10. Lalu remas dan balurkan sampai rata, kemudian masukan ke dalam stoples atau wadah\n" +
                "11. Masukan air sampai semua daging buahnya terendam, kemudian taburi dengan garam lagi lalu aduk rata\n" +
                "12. Tutup dan simpan, asinan kulit cempedak, inilah yang disebut dengan mandai. Mandai ini tahan disimpan dalam jangka waktu panjang.",
        "Pengkang adalah makanan sejenis lemper yang terbuat dari pulut atau ketan yang berisi udang ebi. Kemasannya unik dengan bungkus daun pisang berbentuk segitiga sama kaki yang dijepit dengan bambu. Pengkang dapat Anda temui di seluruh daerah di Kalimantan Barat, tetapi yang paling terkenal ialah Desa Peniti, karena di sana terdapat rumah makan spesialis Pengkang dengan nama Pondok Pengkang yang telah berdiri sejak tahun 1934.\n" +
                "\n" +
                "Bahan\n" +
                "1/2 kg beras ketan" +
                "100 gr ebi dicincang halus, rendam air panas\n" +
                "8 siung bawang merah diiris tipis\n" +
                "4 siung bawang putih diiris tipis\n" +
                "8 cabe kering dicincang halus\n" +
                "3 sdm kecap manis\n" +
                "1/2 sdt masako\n" +
                "1/2 sdt lada\n" +
                "3 sdm minyak untuk menumis\n" +
                "Secukupnya daun pisang, dicuci bersih dan dibakar sebentar\n" +
                "Secukupnya tusuk sate\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan daunnya. Siapkan bahan ebinya\n" +
                "2. Tumis bawang putih dan merah sampai layu. Tambahkan ebi, masak sebentar. Tambahkan cabenya, masako, lada dan kecapnya. Matangkan\n" +
                "3. Setelah ebi matang, tiriskan minyaknya. Ambil 1 sdm beras ketan, letakan pada daun, pipihkan dan berikan ebinya, tutup dan sematkan lidi. Atau bentuk segitiga untuk membungkusnya\n" +
                "4. Setelah dibungkus, panggang diatas kuali yang telah diolesi minyak. Panggang sampai daun hangus dan tercium aroma asapnya.\n" +
                "5. Pengkang siap disajikan",
        "Hekeng adalah makanan khas Pontianak, terbuat dari daging udang dan daging babi yang telah dihaluskan kemudian diberi bumbu dan dibungkus dengan lembaran kembang tahu kering, yang biasanya setelah dikukus, dapat disimpan terlebih dahulu didalam lemari es dan dipotong-dipotong jika ingin digoreng untuk disajikan.\n" +
                "\n" +
                "Bahan\n" +
                "400 gr daging giling\n" +
                "1 butir telur ayam\n" +
                "1 batang daun bawang\n" +
                "1 sdt bawang putih goreng\n" +
                "1 sdt bawang merah goreng\n" +
                "1 sdm terigu\n" +
                "2 sdm tepung maizena\n" +
                "1/2 batang wortel diparut\n" +
                "1 sdm kaldu bubuk\n" +
                "Secukupnya merica\n" +
                "Secukupnya kulit kembang tahu\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Campur semua bahan (kecuali kulit kembang tahu) jadi satu, bisa diblender, bisa diaduk manual.\n" +
                "2. Potong kulit kembang tahu ukuran 20x20 cm.\n" +
                "3. Ambil selembar kulit kembang tahu. Taruh adonan memanjang di tengah kulit kembang tahu. Gulung hingga rapat.\n" +
                "4. Siapkan kukusan yang sudah dipanaskan sebelumnya. Kukus hekeng selama 20 menit.\n" +
                "5. Angkat hekeng yg sudah matang dari kukusan dan dinginkan."
    )

    val listDataKalimantan: ArrayList<DataKalimantanFood>
        get() {
            val list = arrayListOf<DataKalimantanFood>()
            for (position in foodNames.indices)
            {
                val food = DataKalimantanFood()
                food.name = foodNames[position]
                food.photo = foodPhotos[position]
                food.detail = detailFood[position]
                list.add(food)
            }
            return list
        }
}
object SulwesiFood
{
    private val foodNames = arrayOf("Coto Makassar",
        "Kaledo",
        "Kapurung",
        "Pallu Basa",
        "Sayur Putungo")
    private val foodPhotos = intArrayOf(R.drawable.cotomakassar,
        R.drawable.kaledo,
        R.drawable.kapurung,
        R.drawable.pallubasa,
        R.drawable.sayurputungo)
    private val detailFood = arrayOf(
        "Coto Makassar adalah makanan tradisional Makassar, Sulawesi Selatan. Makanan ini terbuat dari jeroan (isi perut) sapi yang " +
                "direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu " +
                "yang diracik secara khusus. Coto dihidangkan dalam mangkuk dan dinikmati dengan ketupat dan \"burasa\" atau yang biasa dikenal " +
                "sebagai buras, yakni sejenis ketupat yang dibungkus daun pisang.\n" +
                "\n" +
                "Bahan\n" +
                "1 kg daging sapi\n" +
                "5 lembar daun jeruk\n" +
                "3 lembar daun salam\n" +
                "Seruas lengkuas\n" +
                "250 gr kacang tanah goreng\n" +
                "Secukupnya kayu manis\n" +
                "Secukupnya garam\n" +
                "Secukupnya air\n" +
                "Secukupnya kaldu bubuk sapi\n" +
                "\n" +
                "Bumbu\n" +
                "10 siung bawang merah\n" +
                "10 siung bawang putih\n" +
                "Seruas jahe\n" +
                "Seruas lengkuas\n" +
                "1 sdt ketumbar\n" +
                "1 sdt merica\n" +
                "1 sdt jintan\n" +
                "1 buah pala\n" +
                "5 butir kemiri\n" +
                "7 batang serai\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih daging, rebus dengan air secukupnya sampai matang,angkat dan sisihkan\n" +
                "2. Sementara daging di rebus, tumis bumbu halus sampai harum dengan minyak secukupnya, " +
                "masukkan daun jeruk, daun salam, lengkuas geprek, kayu manis\n" +
                "3. Masak kembali air rebusan daging sampai mendidih, masukkan bumbu halus, kacang halus, " +
                "biarkan sampai bumbu meresap, masukkan garam dan kaldu bubuk, test rasa, angkat\n" +
                "4. Masukkan daging ke dalam wadah, siram dengan kuah coto, masukkan pelengkap, siap di hidangkan",
        "Kaki Lembu Donggala atau yang lebih dikenal dengan nama Kaledo ini adalah makanan khas masyarakat Donggala" +
                " yang terletak di provinsi Sulawesi Tengah, tepatnya di kota Palu. Makanan ini mirip dengan sup buntut, " +
                "bedanya tulangnya dari kaki lembu dan disajikan bukan dengan nasi melainkan dengan ubi. Tulangnya itu sendiri " +
                "adalah ruas tulang lutut yang masih penuh dengan sum-sum.\n" +
                "\n" +
                "Bahan\n" +
                "1 buah kaki sapi\n" +
                "500 gr daging sapi\n" +
                "1 genggam asam jawa asli\n" +
                "1 genggam cabe rawit hijau\n" +
                "3 buah serai\n" +
                "1 buah jahe ukuran sedang\n" +
                "Secukupnya garam dan micin\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih dan potong2 sesuai selera kaki sapi dan daging sapi\n" +
                "2. Rebus tulang kaki dan daging sapi kurang lebih 30 menit, kemudian tiriskan dan airnya dibuang\n" +
                "3. Lalu rebus kembali tulang dan daging sapi dengan air yang agak banyak hingga dagingnya telah lunak\n" +
                "4. Sambil menunggu dagingnya lunak, siapkan rempah - rempah yang dibutuhkan. Haluskan serai, jahe, asam jawa mentah dan cabe rawit hijau\n" +
                "5. Setelah daging setengah lunak, masukkan serai, jahe, asam yang sudah dilarutkan dengan air ke dalam rebusan daging\n" +
                "6. Setelah daging sudah sempuh, angkat lalu tiriskan ke dalam wadah",
        "Kappurung adalah salah satu makanan khas tradisional di Sulawesi Selatan yang terbuat dari sari atau tepung sagu. terbuat dari sari atau tepung sagu.\n" +
                "\n" +
                "Bahan\n" +
                "1 buah jagung\n" +
                "1 buah jeruk nipis\n" +
                "1 sdm ebi udang kering\n" +
                "3 sdm air asam jawa\n" +
                "3 buah bawang putih\n" +
                "4 buah bawang merah\n" +
                "Secukupnya garam\n" +
                "Secukupnya merica bubuk\n" +
                "2 ekor ikan salem atau jenis ikan kembung / tongkol / tuna\n" +
                "1,5 liter air matang\n" +
                "100 gram tepung sagu\n" +
                "1 sdm minyak sayur untuk menumis\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Buat Kapurung /papeda: larutkan tepung sagu dengan 350ml air sampai tercampur rata, kemudian panaskan diatas kompor sambil diaduk hingga mendidih dan mengental dengan warna bening, matikan kompor dan sisihkan. Setelah dingin buat bola bola dengan menggunakan sendok sayur dan sendok makan dimasukkan ke mangkok " +
                "yang berisi sedikit air(kurlebih 1/4 bagian mangkok)\n" +
                "2. Kuah ikan: siapkan panci sedang diatas kompor, hidupkan api, tuang 1sdm minyak sayur, tumis bawang hingga harum, masukkan potongan ikan, kemudian masukkan air dan aduk pelan sebentar, masukkan air asam jawa, beri garam gula merica/lada secukupnya, aduk rata, cicipi apakah sudah pas rasanya, kalau sudah pas tunggu " +
                "hingga mendidih dan matikan api. Sisihkan\n" +
                "3. Kuah sayur Kapurung : ambil potongan ikan kemudian pisahkan daging dan duri nya, buang durinya dan haluskan/suwir-suwir dagingnya. Didihkan kembali kuah ikannya, masukkan bayam dan jagung aduk sebentar hingga layu, kemudian masukkan ebi yang sudah dihaluskan/diuleg, masukkan suwiran ikan" +
                "tambahkan perasan 1/2buah jeruk nipis, tunggu hingga mendidih kemudian matikan api\n" +
                "4. Penyajian: masukkan beberapa bola bola sagu ke dalam mangkok kemudian di siram dengan kuah sayur.",
        "Pallubasa adalah makanan tradisional Makassar, Sulawesi Selatan. Seperti Coto Mangkasara (Coto Makassar), Pallubasa juga terbuat dari jeroan (isi dalam perut) sapi atau kerbau. Proses memasaknya pun hampir sama dengan Coto Makassar, yaitu direbus dalam waktu lama. Setelah matang, jeroan yang ditambah dengan daging itu diiris-iris, kemudian ditaruh/dihidangkan dalam mangkuk.\n" +
                "\n" +
                "Bahan\n" +
                "600 gr Daging, Hati, Jeroan dan Paru Sapi\n" +
                "200 gr kelapa parut\n" +
                "1500 liter air\n" +
                "Secukupnya asam jawa\n" +
                "\n" +
                "Bumbu\n" +
                "12 Cabe keriting merah\n" +
                "5 cabe rawit merah\n" +
                "10 siung bawaang merah\n" +
                "7 siung bawang putih\n" +
                "1 sdt ketumbar\n" +
                "1/4 sdt jintan\n" +
                "1/4 sdt pala\n" +
                "3 cm jahe\n" +
                "4 cm lengkuas\n" +
                "Secukupnya garam\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Rebus bahan daging sampai mendidih,lalu buang air rebusannya (untuk mengurangi lemak pada daging dan jeroan)selanjut di rebus ulang.\n" +
                "2. Sudah mendidih angkat dan tiriskan, kaldu rebusan yang kedua jangan dibuang.\n" +
                "3. Tumis bumbu halus,kalo sudah wangi masukan sere,kayu manis,cengkeh dan gula merah.\n" +
                "4. Masukan daging yang sudah dipotong dadu\n" +
                "5. Masukan bahan yang sudah ditumis beserta daging ke panci yang ada kaldu daging tadi,tambahkan kelapa yang disangrai, beserta asam jawa, masak sampai daging empuk.",
        "Sayur Putungo menjadi menu sederhana masyarakat Gorontalo dan menjadi ikon kuliner kota Gorontalo di mana terdapat cita rasa yang sangat pedas pada sayur ini. Sayur sederhana ini ternyata menjadi makanan utama di sana. Masyarakat setempat menyukai sayur yang pedas. Bila kurang suka dengan rasa pedas, Anda harus siap-siap menyediakan minum. Sebab tidak ada Sayur Putungo yang tidak pedas. " +
                "Sayur Putungo bisa Anda temui di berbagai restoran yang tersebar di kota Gorontalo.\n" +
                "\n" +
                "Bahan\n" +
                "2 buah Putungo (Jantung Pisang)\n" +
                "300 ml santan\n" +
                "\n" +
                "Bumbu\n" +
                "10 Cabe rawit merah\n" +
                "5 Cabe rawit keriting\n" +
                "1 ruas jahe merah\n" +
                "2 ruas kunyit\n" +
                "6 siung bawang merah\n" +
                "2 siung bawang putih\n" +
                "2 butir kemiri\n" +
                "1 lembar pandan\n" +
                "2 batang sereh\n" +
                "1 ikat kemangi\n" +
                "Secukupnya garam\n" +
                "1 ruas lengkuas\n" +
                "Secukupnya minyak goreng untuk menumis\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Kupas putungo sampai putih dan ambil bagian dalamnya saja. Iris tipis - tipis lalu rebus untuk mengeluarkan getah, setelah itu cuci dan tiriskan\n" +
                "2. Haluskan bumbu\n" +
                "3. Tumis bumbu kemudian masukkan lengkuas, sereh dan daun pandan, lalu tambahkan santan, aduk hingga agak mengental\n" +
                "4. Tambahkan putungo bersama dengan garam\n" +
                "5. Masukkan daun kemangi\n" +
                "6. Sajikan dengan taburan bawang goreng"
    )

    val listDataSulawesi: ArrayList<DataSulawesiFood>
    get() {
       val list = arrayListOf<DataSulawesiFood>()
        for (position in foodNames.indices)
        {
            val food = DataSulawesiFood()
            food.name = foodNames[position]
            food.photo = foodPhotos[position]
            food.detail = detailFood[position]
            list.add(food)
        }
        return list
    }
}
object PpuaFood
{
    private val foodNames = arrayOf("Ikan Bakar Manokwari",
        "Kue Lontar",
        "Sagu Lempeng",
        "Sambal Colo - Colo",
        "Udang Selingkuh")
    private val foodPhotos = intArrayOf(R.drawable.ikanbakarmanokwari,
        R.drawable.kuelontar,
        R.drawable.sagulempeng,
        R.drawable.sambalcolocolo,
        R.drawable.udangselingkuh)
    private val detailFood = arrayOf(
        "Ikan Bakar Manokwari berbeda dengan ikan bakar yang biasa tersaji di warung-warung atau rumah-rumah makan di daerah-daerah lain. Ikan yang biasa dipilih untuk dibakar adalah ikan tongkol, meskipun jenis ikan lain juga tak " +
                "masalah untuk digunakan. Ciri yang paling khas dari masakan Ikan Bakar Manokwari terletak pada bumbu yang disiram pada ikan bakar tersebut yaitu berupa sambal yang digiling kasar disajikan mentah (tidak turut dibakar) yang terkenal dengan rasa pedasnya yang unik.\n" +
                "\n" +
                "Bahan\n" +
                "1 ekor ikan tongkol\n" +
                "1 buah jeruk lemon lokal\n" +
                "1/2 sendok makan garam\n" +
                "\n" +
                "Bumbu\n" +
                "10 butir bawang merah\n" +
                "8 buah cabai rawit merah\n" +
                "1 sendok teh garam\n" +
                "1 sendok teh gula pasir\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Lumuri ikan tongkol dengan air jeruk lemon dan garam. Diamkan 15 menit.\n" +
                "2. Bakar ikan tongkol sambil dibolak-balik sampai matang.\n" +
                "3. Sajikan ikan dengan taburan bumbu tumbuk.",
        "Kue yang sekilas berbentuk mangkuk dan tidak jauh berbeda dengan kue pie susu ini tidak asing ditelinga masyarakat Indonesia bagian Timur.  Rasa yang manis dan gurih membuat Kue Lontar menjadi sajian khas istimewa masyarakat Papua ketika menyambut hari raya Idul Fitri. Kue berbahan dasar margarin, tepung terigu, vanili, dan susu ini diciptakan oleh masyarakat Papua tanpa adanya silang budaya dari luar.\n" +
                "\n" +
                "Bahan\n" +
                "200 gr tepung terigu\n" +
                "120 gr margarine\n" +
                "1/2 sendok teh bubuk vanili\n" +
                "1 balok kecil es batu\n" +
                "1 kaleng susu kental manis\n" +
                "7 butir kuning telur\n" +
                "1 sendoh teh rhum\n" +
                "300 ml air panas\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan piring keramik berukuran sedang\n" +
                "2. Siapkan loyang untuk membuat kulit kue lontar nya: Semua bahan dicampur, diaduk rata dengan menggunakan tangan sehingga menjadi adonan.\n" +
                "3. Lalu bentuk adonan tadi di piring keramik yang sudah disiapkan tadi\n" +
                "4. Campurkan semua bahan & aduk menggunakan Whisk atau garpu\n" +
                "5. Setelah tercampur semua masukan kedalam piring keramik yg sudah ada adonan kue lontar nya tadi.\n" +
                "6. ake di dalam Oven dengan suhu suhu menjadi 120c & panggang sekitar 30-60 mnt dengan api kecil",
        "Sagu lempeng ini terkenal tidak hanya dikalangan masyarakat Papua, tetapi dibeberapa daerah seperti Maluku, Riau dan Kalimantan juga mengonsumsinya. Makanan ini memiliki proses memasak yang cukup mudah seperti roti basah berbahan dasar sagu. Sebelum dimasak sagu harus melalui proses ayak sebanyak 3 kali agar benar- benar halus. Kemudian diolah menjadi adonan, dan tak lupa dicampurkan parutan kelapa serta gula merah " +
                "sebagai tambahan cita rasa. Setelah itu dibakar dalam cetakan selama kurang lebih 60 menit, dengan menggunakan cetakan khusus dari tanah liat bernama forna.\n" +
                "\n" +
                "Bahan\n" +
                "200 gr tepung sagu\n" +
                "100 gr nasi putih\n" +
                "100 gr kelapa parut\n" +
                "5 sdm gula pasir\n" +
                "1/2 sdt garam\n" +
                "1 butir telur ayam\n" +
                "200 ml air putih\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan wadah, kocok telur, gula pasir dan garam hingga tercampur rata\n" +
                "2. Masukkan tepung, kelapa, nasi dan air, aduk - aduk hingga rata dan jangan terlalu kental maupun cair\n" +
                "3. Panaskan teflon oles mentega atau minyak goreng. Masak seperti lempeng atau pancake. Siap untuk disajikan",
        "Sambal colo-colo adalah sambal yang populer di Sulawesi dan Maluku.[1] Sambal colo-colo berbahan dasar cabai, kecap, dan air jeruk nipis. Sambal colo-colo memiliki perpaduan rasa segar, pedas, dan manis.\n" +
                "\n" +
                "Bahan\n" +
                "15 - 25 buah cabe rawit\n" +
                "5 siung bawang merah\n" +
                "2 buah tomat mengkal\n" +
                "Secukupnya garam dan gula\n" +
                "Secukupnya kaldu jamur\n" +
                "1 - 2 sdm kecap manis\n" +
                "Secukupnya air panas\n" +
                "1 sdm air jeruk nipis\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Potong - potong kecil bawang merah, cabe rawit dan tomat yang sudah dicuci bersih dan dibilas air matang. Masukkkan dalam wadah\n" +
                "2. Beri garam, kaldu jamur, gula lalu tuang air panas beserta kecap dan aduk rata.\n" +
                "3. Terakhir beri air jeruk nipis",
        "Mengapa dinamakan Udang Selingkuh? Nama unik ini dikaitkan dengan keberadaan capit/jepit besar yang terdapat pada udang tersebut. Tekstur tubuhnya persis sebagaimana udang pada umumnya. Bedanya, udang jenis ini memiliki capit seperti capit kepiting. Bila dilihat dari arah belakang, ia memang mirip udang, apalagi setelah kelihatan kepalanya. Namun, bila dilihat dari arah depan, biota air tawar yang bungkuk ini seperti " +
                "kepiting karena mempunyai kaki depan yang panjang dan besar layaknya kepiting.\n" +
                "\n" +
                "Bahan\n" +
                "500 gr udang kupas\n" +
                "1/2 siung bawang bombay besar\n" +
                "1 sdt air asam jawa\n" +
                "Secukupnya garam dan gula\n" +
                "3 sdm minyak untuk menumis\n" +
                "2 sdm fibercreme\n" +
                "\n" +
                "Bumbu\n" +
                "5 Siung bawang merah\n" +
                "3 Siung bawang putih\n" +
                "10 buah cabe merah\n" +
                "1 buah tomat\n" +
                "1 ruas jahe\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan semua bahan. Cuci bersih udang, lumuri dengan air jeruk nipis supaya tidak amis. Haluskan bumbu. Jika ingin warnanya lebih cantik, bisa campur dengan cabe merah besar.\n" +
                "2. Panaskan minyak. Tumis bawang bombay sampai harum, lalu masukkan udang, masak sampai udang berubah warna. Masukkan bumbu halus, aduk sampai tercampur rata.\n" +
                "3. Masukkan fibercreme, air asam jawa, garam, dan gula, aduk, koreksi rasa. Angkat, siap disajikan."
    )

    val listDataPapua: ArrayList<DataPapuaFood>
    get() {
        val list = arrayListOf<DataPapuaFood>()
        for (position in foodNames.indices)
        {
            val food = DataPapuaFood()
            food.name = foodNames[position]
            food.photo = foodPhotos[position]
            food.detail = detailFood[position]
            list.add(food)
        }
        return list
    }
}
object RecommendedFood
{
    private val foodNames = arrayOf("Rendang",
        "Soto Padang",
        "Gudeg",
        "Nasi Liwet",
        "Coto Makassar",
        "Kaledo",
        "Ketupat Kandangan",
        "Chai Kue",
        "Ikan Bakar Manokwari",
        "Kue Lontar")
    private val foodPhotos = intArrayOf(R.drawable.rendang,
        R.drawable.sotopadang,
        R.drawable.gudeg,
        R.drawable.nasiliwet,
        R.drawable.cotomakassar,
        R.drawable.kaledo,
        R.drawable.ketupatkandangan,
        R.drawable.chaikue,
        R.drawable.ikanbakarmanokwari,
        R.drawable.kuelontar)
    private val detailFood = arrayOf(
        "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan" +
                " dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.\n" +
                "\n" +
                "Bahan\n" +
                "250 gram daging sapi\n" +
                "100 gram cabe halus\n" +
                "4 butir kemiri\n" +
                "4 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "2 cm jahe\n" +
                "2 cm kunyit\n" +
                "600 ml santan kental\n" +
                "1/4 sdt jinten\n" +
                "3 buat cengkeh\n" +
                "1/2 sdt ketumbar\n" +
                "2 cm kayu manis\n" +
                "1 potong kecil adas manis\n" +
                "10 butir lada putih\n" +
                "1 batang sereh\n" +
                "2 cm lengkuas\n" +
                "1 sdt garam\n" +
                "1/2 sdt gula pasir\n" +
                "5 sdm minyak untuk menumis\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Iris bawang merah dan bawang putih.\n" +
                "2. Haluskan bumbu lainnya kecuali kayu manis, adas manis, sereh dan cengkeh\n" +
                "3. Ambil 1 sdm cabe halus lalu campurkan ke daging, aduk rata.\n" +
                "4. Tumis bawang merah dan bawang putih iris.\n" +
                "5. Masukkan daging yang sudah dicampur cabai halus, aduk sampai tercampur rata.\n" +
                "6. Masukkan santan encer sebanyak 1 liter, masak dan sesekali diaduk sampai mendidih dan santan tinggak setengahnya.\n" +
                "7. Masukkan semua sisa bumbu dan aduk sampai tercampur rata.\n" +
                "8. Tambahkan 1 liter santan encer lagi dan masak terus sampai santan tinggal sedikit kemudian masukkan 1/2 liter santan " +
                "\tkental, masak terus sambil diaduk sampai mengering. (Kalau daging masih keras bisa ditambahkan air panas secukupnya dan " +
                "\tmasak terus sampai daging lunak).",
        "Soto Padang menggunakan potongan daging sapi yang digoreng. Ciri khas lainnya adalah adanya perkedel dan kerupuk berwarna merah" +
                " jambu sebagai pelengkap. Soto Padang memiliki cita rasa gurih yang berasal dari kaldu sapi. Selain itu, soto ini juga disajikan" +
                " bersama dengan soun dan irisan tomat. Untuk menambah kelezatannya, Anda juga bisa menambahkan irisan jeruk nipis.\n" +
                "\n" +
                "Bahan\n" +
                "400 gram daging sapi\n" +
                "2 batang daun bawang\n" +
                "1 batang seledri\n" +
                "1 sdt kaldu bubuk\n" +
                "1/2 sdt garam\n" +
                "2 liter air\n" +
                "Secukupnya minyak goreng\n" +
                "3 siung bawang putih\n" +
                "8 butir bawang merah\n" +
                "2 cm jahe\n" +
                "4 cm lengkuas\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Dalam panci, rebus daging sapi dengan sedikit air sampai mendidih dan keluar busa kotorannya. Ambil dan buang kotoran yang mengapung. " +
                "\tMatikan api lalu buang air bekas rebusannya. Tiriskan daging lalu cuci kembali hingga bersih. Sisihkan.\n" +
                "2. Dalam panci, rebus 2 liter air baru. Masukkan daging, daun bawang, dan seledri. Masak hingga daging empuk. Angkat daging dan tiriskan. " +
                "\tSementara itu, terus lanjutkan merebus kuah. Sisihkan.\n" +
                "3. Panaskan sedikit minyak Tumis bumbu halus lalu matikan api\n" +
                "4. Tuang tumisan bumbu ke dalam panci rebusan. Bumbui dengan kaldu bubuk dan garam. Masak kuah hingga mendidih lalu koreksi rasanya. Matikan api. Sisihkan.\n" +
                "5. Ambil daging, lalu potong jadi dadu kecil atau iris tipis. Goreng daging dalam minyak panas sampai kering. Angkat dan tiriskan. Sisihkan.\n" +
                "6. Tata soun, tomat, daging goreng, dan perkedel kentang dalam mangkok saji. Siram dengan kuah. Taburi dengan bawang goreng dan beri kerupuk pink.\n" +
                "7. Siap disajikan dengan sambal dan irisan jeruk nipis.",
        "Gudeg adalah masakan tradisional Jawa dari Yogyakarta dan Jawa Tengah, Indonesia. Dalam perkembangannya, masyarakat mengenal gudeg terkenal berasal dari Yogyakarta sehingga membuat kota ini dikenal dengan nama Kota Gudeg." +
                "Gudeg terbuat dari nangka muda mentah (Jawa: gori). Direbus selama beberapa jam dengan gula aren, dan santan rempah-rempah tambahan termasuk bawang putih, bawang merah, kemiri, biji ketumbar, lengkuas, daun salam, " +
                "dan daun jati, yang memberikan warna coklat kemerahan ke masakan.\n" +
                "\n" +
                "Bahan\n" +
                "600 gr Nangka muda\n" +
                "Air secukupnya untuk merebus nangka\n" +
                "3 lembar daun jati atau ganti dengan 2 sachet teh celup atau 3 sdm kulit bawang merah\n" +
                "4 butir telur ayam rebus\n" +
                "1 liter santan cair atau 400 ml santan kental dicampur dengan 600 ml air\n" +
                "400 ml santan sangat kental\n" +
                "2 lembar daun salam\n" +
                "3 cm lengkuas\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Masukkan daun jati / kulit bawang merah / teh celup di alas panci perebus\n" +
                "2. Masukkan potongan nangka beserta air sampai semua nangka terendam\n" +
                "3. Tiriskan nangka, buang air rebusan\n" +
                "4. Haluskan semua bahan bumbu halus dengan cobek atau blender. Jika perlu " +
                "tambahkan sedikit santan ke dalam blender untuk mempermudah proses penghancuran.\n" +
                "5. Taruh nangka rebus/nangka kalengan ke dalam panci, masukkan bumbu halus, daun salam, " +
                "lengkuas dan santan encer. Masak dengan api sedang hingga mendidih\n" +
                "6. Setelah mendidih, masukkan telur rebus dan santan kental, masak dengan api sedang hingga " +
                "santan menyusut dan bumbu meresap. Aduk2 supaya santan tidak pecah.",
        "Nasi Liwet adalah  makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. " +
                "Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur " +
                "labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa).\n" +
                "\n" +
                "Bahan\n" +
                "1. 4 cup beras\n" +
                "2. 2 batang sereh\n" +
                "3. 2 lembar daun salam\n" +
                "4. 5 siung bawang merah\n" +
                "5. 3 siung bawang putih\n" +
                "6. 1 genggam teri\n" +
                "7. 2 biji cabe merah besar\n" +
                "8. Secukupnya garam\n" +
                "9. Secukupnya kaldu bubuk\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih beras,kemudian tempatkan pada rice cooker\n" +
                "2. Goreng teri hingga coklat keemasan,sisihkan.\n" +
                "3. Iris tipis duo bawang & iris serong cabe merah besar.\n" +
                "4. Tumis bawang dan cabe merah hingga harum.tambahkan sereh simpul yang sudah digeprek dan daun salam\n" +
                "5. Masukkan teri goreng.tumis sebentar,kmudian masukkan tumisan tadi kedalam beras yang sudah dicuci bersih.\n" +
                "6. Tambahkan air sebanyak takaran ketika memasak nasi biasanya.\n" +
                "7. Tambahkan garam dan kaldu bubuk\n" +
                "8. Setelah matang, bisa langsung diaduk supaya rasa lebih merata",
        "Coto Makassar adalah makanan tradisional Makassar, Sulawesi Selatan. Makanan ini terbuat dari jeroan (isi perut) sapi yang " +
                "direbus dalam waktu yang lama. Rebusan jeroan bercampur daging sapi ini kemudian diiris-iris lalu dibumbui dengan bumbu " +
                "yang diracik secara khusus. Coto dihidangkan dalam mangkuk dan dinikmati dengan ketupat dan \"burasa\" atau yang biasa dikenal " +
                "sebagai buras, yakni sejenis ketupat yang dibungkus daun pisang.\n" +
                "\n" +
                "Bahan\n" +
                "1 kg daging sapi\n" +
                "5 lembar daun jeruk\n" +
                "3 lembar daun salam\n" +
                "Seruas lengkuas\n" +
                "250 gr kacang tanah goreng\n" +
                "Secukupnya kayu manis\n" +
                "Secukupnya garam\n" +
                "Secukupnya air\n" +
                "Secukupnya kaldu bubuk sapi\n" +
                "\n" +
                "Bumbu\n" +
                "10 siung bawang merah\n" +
                "10 siung bawang putih\n" +
                "Seruas jahe\n" +
                "Seruas lengkuas\n" +
                "1 sdt ketumbar\n" +
                "1 sdt merica\n" +
                "1 sdt jintan\n" +
                "1 buah pala\n" +
                "5 butir kemiri\n" +
                "7 batang serai\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih daging, rebus dengan air secukupnya sampai matang,angkat dan sisihkan\n" +
                "2. Sementara daging di rebus, tumis bumbu halus sampai harum dengan minyak secukupnya, " +
                "masukkan daun jeruk, daun salam, lengkuas geprek, kayu manis\n" +
                "3. Masak kembali air rebusan daging sampai mendidih, masukkan bumbu halus, kacang halus, " +
                "biarkan sampai bumbu meresap, masukkan garam dan kaldu bubuk, test rasa, angkat\n" +
                "4. Masukkan daging ke dalam wadah, siram dengan kuah coto, masukkan pelengkap, siap di hidangkan",
        "Kaki Lembu Donggala atau yang lebih dikenal dengan nama Kaledo ini adalah makanan khas masyarakat Donggala" +
                " yang terletak di provinsi Sulawesi Tengah, tepatnya di kota Palu. Makanan ini mirip dengan sup buntut, " +
                "bedanya tulangnya dari kaki lembu dan disajikan bukan dengan nasi melainkan dengan ubi. Tulangnya itu sendiri " +
                "adalah ruas tulang lutut yang masih penuh dengan sum-sum.\n" +
                "\n" +
                "Bahan\n" +
                "1 buah kaki sapi\n" +
                "500 gr daging sapi\n" +
                "1 genggam asam jawa asli\n" +
                "1 genggam cabe rawit hijau\n" +
                "3 buah serai\n" +
                "1 buah jahe ukuran sedang\n" +
                "Secukupnya garam dan micin\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Cuci bersih dan potong2 sesuai selera kaki sapi dan daging sapi\n" +
                "2. Rebus tulang kaki dan daging sapi kurang lebih 30 menit, kemudian tiriskan dan airnya dibuang\n" +
                "3. Lalu rebus kembali tulang dan daging sapi dengan air yang agak banyak hingga dagingnya telah lunak\n" +
                "4. Sambil menunggu dagingnya lunak, siapkan rempah - rempah yang dibutuhkan. Haluskan serai, jahe, asam jawa mentah dan cabe rawit hijau\n" +
                "5. Setelah daging setengah lunak, masukkan serai, jahe, asam yang sudah dilarutkan dengan air ke dalam rebusan daging\n" +
                "6. Setelah daging sudah sempuh, angkat lalu tiriskan ke dalam wadah",
        "Ketupat Kandangan merupakan kuliner khas yang berasal dari daerah Kandangan, Kalimantan Selatan. Seperti ketupat pada umumnya, bahan untuk membuat " +
                "ketupat berasal dari beras. Perbedaan ketupat Kandangan dengan jenis ketupat lainnya adalah penggunaan ikan gabus (haruan) sebagai menu pelengkap.\n" +
                "\n" +
                "Bahan\n" +
                "8 potong ikan haruan (gabus) sudah dipanggang\n" +
                "12 buah ketupat siap makan\n" +
                "Secukupnya bawang goreng\n" +
                "1 kg kelapa parut\n" +
                "1 butir telur\n" +
                "\n" +
                "Bumbu\n" +
                "2 ujung jari kencur\n" +
                "6 butir kemiri\n" +
                "2 ibu jari jahe\n" +
                "12 siung bawang merah\n" +
                "7 siung bawang putih\n" +
                "3 buah cabe kering\n" +
                "2 ruas sereh\n" +
                "1 ruas lengkuas\n" +
                "3 liter air\n" +
                "Secukupnya garam dan penyedap\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan kelapa parut dalam baskom,masukan telur (hintalu) dan 2 1/2 liter air aduk sambil diremas-remas lalu peras dan saring santannya.\n" +
                "2. Masak santan bersama sereh dan lengkuas sambil di aduk perlahan,sebelum mendidih masukan bumbu yang di haluskan,dan cabe kering,aduk pelan agar" +
                " santan tidak pecah tambahklan garam,penyedap\n" +
                "3. Setelah mendidih aduk-aduk terus dengan api sedang beberapa saat.setelah matang matikan apinya biarkan sampai sari santan mengapung\n" +
                "4. Ambil menggunakan saringan teh, pisahkan sari santan kentalnya pisahkan di wadah mankuk,sisihkan\n" +
                "5. Didihkan kembali kuah santan,masukan ikan haruan/gabus panggangnya dan hintalu rebus jika suka,.aduk-aduk sebentar pelan saja llalu angkat.\n" +
                "6. Siapkan potongan ketupat di piring saji,beri sepotong ikan haruan,tuang kuah santan secukupnya saja tambahkan sedikit sari santan yang di pisahkan tadi tambahkan hintalu,taburi bawang goreng\n" +
                "7. Ketupat kandangan siap disajikan",
        "Chai kue atau choi pan merupakan hidangan Tionghoa asal Kalimantan Barat. Sepintas bentuknya mirip dengan pastel atau kroket, tetapi pengolahannya berbeda, jika pastel dan kroket harus digoreng terlebih dahulu, " +
                "maka chai kue harus dikukus sebelum disajikan. Isi chai kue dapat berupa bengkuang, talas, maupun kucai. Kulit chai kue yang tipis terbuat dari tepung beras dengan pelengkap bawang goreng di atasnya.\n" +
                "\n" +
                "Bahan\n" +
                "100 gram tepung beras\n" +
                "25 gram tepung sagu\n" +
                "2 sendok makan minyak goreng\n" +
                "Secukupnya garam\n" +
                "200 ml air\n" +
                "Secukupnya bengkuang\n" +
                "Secukupnya keladi\n" +
                "Secukupnya kucai\n" +
                "Secukupnya udang\n" +
                "Secukupnya bawang putih\n" +
                "Secukupnya lada\n" +
                "Secukupnya garam\n" +
                "Secukupnya bawang putih\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan untuk bahan isinya terlebih dahulu, cuci bersih kucai potong ukuran 3 cm, kupas bengkuang bersihkan dan parut dengan parutan rujak, rebus keladi dan parut juga\n" +
                "2. Lalu tumis masing - masing isian tersebut dengan bumbu yang telah dihaluskan dahulu yaitu Ebi, bawang putih dan lada dan bubuhi garam secukupnya. (menumisnya masing-masing Bengkuang sendiri, keladi sendiri dst)\n" +
                "3. Setelah ditumis tiriskan isian tadi agar saat diisikan ke kulit tidak byk mengandung air.\n" +
                "4. Mulailah membuat kulit ambil sejumput adonan pipihkan berbentuk lingkaran dengan diameter 6-7 cm lalu isi kemudian tutup seperti membuat pastel.\n" +
                "5. Siapkan kukusan lalu kukus selama 7 - 10 menit\n" +
                "6. Setelah matang bubuhi atasnya dengan minyak bawang putih",
        "Ikan Bakar Manokwari berbeda dengan ikan bakar yang biasa tersaji di warung-warung atau rumah-rumah makan di daerah-daerah lain. Ikan yang biasa dipilih untuk dibakar adalah ikan tongkol, meskipun jenis ikan lain juga tak " +
                "masalah untuk digunakan. Ciri yang paling khas dari masakan Ikan Bakar Manokwari terletak pada bumbu yang disiram pada ikan bakar tersebut yaitu berupa sambal yang digiling kasar disajikan mentah (tidak turut dibakar) yang terkenal dengan rasa pedasnya yang unik.\n" +
                "\n" +
                "Bahan\n" +
                "1 ekor ikan tongkol\n" +
                "1 buah jeruk lemon lokal\n" +
                "1/2 sendok makan garam\n" +
                "\n" +
                "Bumbu\n" +
                "10 butir bawang merah\n" +
                "8 buah cabai rawit merah\n" +
                "1 sendok teh garam\n" +
                "1 sendok teh gula pasir\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Lumuri ikan tongkol dengan air jeruk lemon dan garam. Diamkan 15 menit.\n" +
                "2. Bakar ikan tongkol sambil dibolak-balik sampai matang.\n" +
                "3. Sajikan ikan dengan taburan bumbu tumbuk.",
        "Kue yang sekilas berbentuk mangkuk dan tidak jauh berbeda dengan kue pie susu ini tidak asing ditelinga masyarakat Indonesia bagian Timur.  Rasa yang manis dan gurih membuat Kue Lontar menjadi sajian khas istimewa masyarakat Papua ketika menyambut hari raya Idul Fitri. Kue berbahan dasar margarin, tepung terigu, vanili, dan susu ini diciptakan oleh masyarakat Papua tanpa adanya silang budaya dari luar.\n" +
                "\n" +
                "Bahan\n" +
                "200 gr tepung terigu\n" +
                "120 gr margarine\n" +
                "1/2 sendok teh bubuk vanili\n" +
                "1 balok kecil es batu\n" +
                "1 kaleng susu kental manis\n" +
                "7 butir kuning telur\n" +
                "1 sendoh teh rhum\n" +
                "300 ml air panas\n" +
                "\n" +
                "Cara Memasak\n" +
                "1. Siapkan piring keramik berukuran sedang\n" +
                "2. Siapkan loyang untuk membuat kulit kue lontar nya: Semua bahan dicampur, diaduk rata dengan menggunakan tangan sehingga menjadi adonan.\n" +
                "3. Lalu bentuk adonan tadi di piring keramik yang sudah disiapkan tadi\n" +
                "4. Campurkan semua bahan & aduk menggunakan Whisk atau garpu\n" +
                "5. Setelah tercampur semua masukan kedalam piring keramik yg sudah ada adonan kue lontar nya tadi.\n" +
                "6. ake di dalam Oven dengan suhu suhu menjadi 120c & panggang sekitar 30-60 mnt dengan api kecil"
    )

    val listDataRecommended: ArrayList<DataRecommendedFood>
        get() {
            val list = arrayListOf<DataRecommendedFood>()
            for (position in foodNames.indices) {
                val food = DataRecommendedFood()
                food.name = foodNames[position]
                food.photo = foodPhotos[position]
                food.detailFood = detailFood[position]
                list.add(food)
            }
            return list
        }
}
