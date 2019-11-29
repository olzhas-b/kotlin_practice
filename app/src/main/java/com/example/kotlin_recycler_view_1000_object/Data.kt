package com.example.kotlin_recycler_view_1000_object;

import com.example.kotlin_recycler_view_1000_object.Constructor_Post

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Constructor_Post>{
            val list = ArrayList<Constructor_Post>()
            for(i in 0..1000) {
                list.add(
                    Constructor_Post(
                        "Congratulations!",
                            "https://naavtotrasse.ru/wp-content/uploads/2019/03/c847c4c340975195b27d336ff96d5f6d.jpg",
                        "Olzhas Bazarbekov"
                    )
                )
                list.add(
                    Constructor_Post(
                        "the big mistake",
                        "https://richardsolomon.com/wp-content/uploads/2016/09/Mark-T-Smith-042-FINANICAL.jpg",
                        "firstname lastname"
                    )
                )

                list.add(
                    Constructor_Post(
                        "Interviewing a Web Developer and YouTuber",
                        "https://pbs.twimg.com/media/CX6Gj9ZWsAA_etm.jpg",
                        "John"
                    )
                )
                list.add(
                    Constructor_Post(
                        "Дѝснейле́нд — парк развлечений в городе Анахайме, находящийся под управл»",
                        "https://mcdn.wallpapersafari.com/medium/19/15/coxA9H.jpg",
                        "disneyland"
                    )
                )
                list.add(
                    Constructor_Post(
                        "Freelance ..................",
                        "https://m.theepochtimes.com/assets/uploads/2017/05/31/kitkat-GettyImages-615785494-1200x800.jpg",
                        "bazarbekov olzhas"
                    )
                )
                list.add(
                    Constructor_Post(
                        "just description, no comment",
                        "https://img.freepik.com/free-vector/shining-circle-purple-lighting-isolated-dark-background_1441-2396.jpg?size=626&ext=jpg",
                        "Arman"
                    )
                )
            }
            return list
        }
    }
}
