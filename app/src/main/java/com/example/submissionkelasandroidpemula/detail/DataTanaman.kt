package com.example.submissionkelasandroidpemula.detail

//import com.example.submissionkelasandroidpemula.ListTanaman
import com.example.submissionkelasandroidpemula.R
import java.util.EnumSet.range

object DataTanaman {

    private val namaTanaman = arrayOf(
        "Jahe",
        "Kencur",
        "Temulawak",
        "Kapulaga",
        "Kecibeling",
        "Kumis Kucing",
        "Kunyit",
        "Lengkuas",
        "Mahkota Dewa",
        "Mengkudu",
        "Sambiloto",
        "Serai"
    )
    private val GambarTanaman = intArrayOf(
        R.drawable.jahe,
        R.drawable.kencur,
        R.drawable.temulawak,
        R.drawable.kapulaga,
        R.drawable.kecibeling,
        R.drawable.kumis_kucing,
        R.drawable.kunyit,
        R.drawable.lengkuas,
        R.drawable.mahkota_dewa,
        R.drawable.mengkudu,
        R.drawable.sambiloto,
        R.drawable.serai
    )
    private var Data_detail = arrayOf(
        """
            |Jahe kaya akan gingerol, zat dengan sifat anti-inflamasi dan antioksidan yang kuat. 
            |Jahe mengandung berbagai senyawa bermanfaat dan telah lama digunakan dalam praktik tradisional 
            |untuk mengobati pilek, mual, migrain, dan tekanan darah tinggi. 
            |Jahe juga dapat melawan bakteri dan virus berbahaya. 
            |Ini juga dapat mengurangi risiko infeksi.""".trimMargin(),
        """
            |Kencur masuk dalam kategori rimpang tanaman obat yang telah dibudidayakan sejak lama di Indonesia. 
            |Kencur termasuk tanaman monokotil dalam keluarga tanaman jahe. 
            |Kencur memiliki sifat menghangatkan yang cocok bagi penderita flu atau sakit perut. 
            |Kencur kerap digunakan untuk meningkatkan nafsu makan. 
            |Kencur juga dapat digunakan untuk mencegah jerawat, sariawan, dan diare.""".trimMargin(),

        """
            |Temulawak dikenal luas sebagai penambah stamina tubuh. 
            |Temulawak bisa mendetoksifikasi tubuh, membuat tubuh terasa bugar dan segar. 
            |Temulawak bisa mengurangi gejala masuk angin, demam, batuk, dan flu. 
            |Temulawak juga digunakan untuk menambah nafsu makan..""".trimMargin(),

        """
            |Kapulaga adalah bumbu dengan rasa yang kuat dan sedikit manis. 
            |Biji, minyak dan ekstrak kapulaga dianggap memiliki khasiat obat. 
            |Kapulaga telah digunakan dalam pengobatan tradisional selama berabad-abad. 
            |Macam-macam tanaman obat satu ini kerap digunakan sebagai campuran jamu atau masakan.""".trimMargin(),

        """
            |Kecibeling termasuk jenis perdu yang banyak dimanfaatkan sebagai bahan herbal. 
            |Tumbuhan ini merupakan perdu yang berasal dari Madagaskar menyebar ke Indonesia 
            |dan tumbuh subur di Malaysia. 
            |Kecibeling digunakan sebagai anti diabetes, diuretik, antisipilis, antioksidan, 
            |dan antimikroba, dan laksatif. """.trimMargin(),

        """
            |Kumis kucing merupakan tanaman obat yang banyak dikenal khasiatnya. 
            |Tanaman ini terkenal dengan bentuk bunganya yang mirip dengan kumis kucing. 
            |Kumis kucing memiliki sifat diuretik, menghentikan kejang, mengurangi pembengkakan, 
            |dan membantu melawan bakteri. """.trimMargin(),

        """
            |Kunyit merupakan satu dari macam-macam tanaman obat yang sangat populer.
            |Kunyit termasuk jenis rimpang yang sangat mudah tumbuh. 
            |Dengan warna jingga yang menyala, kunyit punya sifat antioksidan 
            |dan anti-iflamasi.""".trimMargin(),

        """
            |Lengkuas merupakan herbal yang berasal dari keluarga jahe dengan genus Alpinia. 
            |Fitur kulit lengkuas cenderung lebih pucat dan lebih halus dari jahe 
            |dan daging yang cukup berserat. 
            |Lengkuas merupakan salah satu rempah andalan di berbagai kudapan Indonesia.""".trimMargin(),

        """
            |Mahkota dewa punya rasa yang sangat pahit. 
            |Buah ini dikenal sebagai buah beracun yang bisa mematikan jika tidak diolah dengan benar. 
            |Mahkota dewa kaya akan antioksidan seperti flavonoid, polifenol, dan alkaloid. 
            |Semuanya berperan dalam mencegah berbagai penyakit seperti tekanan darah tinggi 
            |hingga penyakit jantung""".trimMargin(),

        """
            |Mengkudu termasuk dalam macam-macam tanaman obat yang penuh khasiat. 
            |Di Indonesia, mengkudu menjadi obat herbal untuk berbagai penyakit. 
            |Mengkudu dikenal sebagai buah yang super pahit. Namun, di balik rasa pahitnya, 
            |mengkudu punya khasiat yang kuat.""".trimMargin(),

        """
            |Sambiloto merupakan tanaman obat yang kerap digunakan sebagai bahan jamu. 
            |Olahan daun sambiloto memiliki rasa pahit khas jamu. 
            |Sambiloto berkhasiat sebagai obat demam, obat penyakit kulit, obat kencing manis, 
            |obat radang telinga, dan obat masuk angin.""".trimMargin(),

        """
            |Serai termasuk tanaman obat yang sangat mudah ditemukan. 
            |Serai mengandung zat yang dianggap dapat meredakan nyeri dan bengkak, menurunkan demam, 
            |mengontrol kadar gula dan kolesterol dalam darah, merangsang rahim dan aliran menstruasi, 
            |serta memiliki sifat antioksidan. """.trimMargin(),
    )

    val List_data: ArrayList<Tumbuhan>
    get(){
        val list = arrayListOf<Tumbuhan>()
        for(aData in Data_detail.indices){
            val tumbuhan = Tumbuhan()
            tumbuhan.name = namaTanaman[aData]
            tumbuhan.photo = GambarTanaman[aData]//.toString()
            tumbuhan.detail = Data_detail[aData]

            list.add(tumbuhan)
        }
        return list
    }

}