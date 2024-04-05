package za.ac.iie.mhistory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Declarations*/
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val textView1 = findViewById<TextView>(R.id.textView1)


        /*button set to use to generate the match between the ages */
        btn1.setOnClickListener {
            val age = editText1.text.toString().toIntOrNull()


            /*if else statement used */
            if(age == null){
                textView1.text = "Please enter valid age"
            }
            else {

                //
                val result = when (age) {
                    /*Ages of famous figures who have passed on*/
                    42 -> "Elvis Presley, born on January 8, 1935, in Tupelo, Mississippi, was an American singer and actor. He is widely known as the “King of Rock and Roll” and was one of rock music’s dominant performers from the mid-1950s"
                    67 -> "George Washington (1732-99) was commander in chief of the Continental Army during the American Revolutionary War (1775-83) and served two terms as the first U.S. president, from 1789 to 1797."
                    36 -> "Marilyn Monroe was an American actress and model. She gained fame for portraying comic “blonde bombshell”"
                    60 -> "Diego Maradona was a professional football player who was regarded as one of the greatest soccer player in the history of soccer"
                    32 -> "Bruce Lee was American-born film actor who was renowned for his martial arts prowess and who helped popularize martial arts movies in the 1970s."
                    40 -> "Paul Walker was an American actor who came to fame in movies such as 'Varsity Blues' and became well-known for his starring role in 'The Fast and the Furious' franchise."
                    74 -> "Muhammed Ali was professional boxer and social activist "
                    82 -> "Pele was a brazilian soccer who was regarded as one of the best soccer players in the world "
                    95 -> "Nelson Rolihlahla Mandela was a South African revolutionary and politician who radically changed the conditions of the Apartheid state of South Africa "
                    20 -> "Cameron Boyce was an actor and dancer who had his breakthrough roles as a child actor in Grown Ups and Eagle Eye"
                    41 -> "Kobe Bryant was a professional basketball player who became one of the most successful basketball players of all time "
                    43-> "Chadwick Boseman was an american actor who is most famous for his roll in black panther an jackie robinson "
                    53 -> "Irrfan khan was and indian actor who made his breakthrough from the movie salaam Bombay"
                    99 -> "Betty white was a comdeic actress who stared in The Golden Girls and won 6 Emmy Awards "

                    else -> "No one has died at this age"
                }
                textView1.text = result


                /*Button set to clear text*/
                btn2.setOnClickListener {
                    editText1.text.clear()
                    textView1.text = ""
                }

                /*The independent institute of Education IMAD5112 manual assisted me with the coding  (2024)*/


            }
        }
    }
}







