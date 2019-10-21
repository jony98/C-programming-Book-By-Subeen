package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Third extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় তিন");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView = (HtmlTextView) findViewById(R.id.html_text);
        htmlTextView.setHtml("<html lang=\"en\">\n" +
                        "<head>\n" +

                        "</head>\n" +
                        "<body>\n" +
                        "    <div class=\"post hentry\">\n" +
                        "<a name=\"5180375968540477431\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় তিন] কন্ডিশনাল লজিক।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-5180375968540477431\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তোমরা অনেকেই হয়তো জানো যে 'চাচা চৌধুরীর বুদ্ধি কম্পিউটারের চেয়েও প্রখর'! এটি শুনে প্রথম প্রথম চাচা চৌধুরীর ওপর ভক্তি-শ্রদ্ধা অনেক বেড়ে গেলেও একটু চিন্তা করলেই তোমরা বুঝতে পারবে যে আসলে তোমাদের সবার বুদ্ধি কম্পিউটারের চেয়ে প্রখর। আসলে কম্পিউটারের তো কোনো বুদ্ধিই নেই। প্রোগ্রামাররা যেভাবে প্রোগ্রাম লিখে দেয় কম্পিউটার সেভাবে কাজ করে। এখন আমরা প্রোগ্রামিংয়ের সহজ অথচ খুব গুরুত্বপূর্ণ একটি বিষয় শিখব। সেটি হচ্ছে কন্ডিশনাল লজিক। কোন শর্তে কী করতে হবে সেটি প্রোগ্রাম লিখে কম্পিউটারকে বোঝাতে হবে। কথা না বাড়িয়ে আমরা প্রোগ্রাম লেখা শুরু করে দিই। তোমরা কিন্তু অবশ্যই প্রতিটি প্রোগ্রাম কম্পিউটারে চালিয়ে দেখবে।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int n;   \n" +
                        "     n = 10;   \n" +
                        "     if(n &gt;= 0) {   \n" +
                        "         printf(\"The number is positive\\n\");   \n" +
                        "     }   \n" +
                        "     else {   \n" +
                        "         printf(\"The number is negative\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.১  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "ওপরের প্রোগ্রামটির কাজ কী? n-এর বিভিন্ন মান (যেমন: 0, -10, -2, 5, 988 ইত্যাদি) বসিয়ে তোমরা প্রোগ্রামটি চালাও। দেখা যাচ্ছে যে এর কাজ হচ্ছে n ধনাত্মক (positive) না ঋণাত্মক (negative) সেটি নির্ণয় করা। কোন সংখ্যা ধনাত্মক হতে গেলে একটি শর্ত পূরণ করতে হয়। সেটি হচ্ছে তাকে শূন্যের সমান বা তার চেয়ে বড় হতে হয়। তাহলে আমাদের লজিকটি দাঁড়াচ্ছে এ রকম যে, 'n যদি শূন্যের সমান বা বড় হয়, তবে nধনাত্মক, না হলে n ঋণাত্মক'। এই ব্যাপারটি সি ল্যাঙ্গুয়েজে প্রকাশ করতে হয় if এবং তার সঙ্গে else ব্যবহার করে। if-এর ভেতর একটি শর্ত (কন্ডিশন) লিখে দিতে হয় যা সত্যি হলেই কেবল তার ভেতরের অংশের কাজ হয় (মানে if-এর পর যে দ্বিতীয় বন্ধনী { } ব্যবহার করা হয়েছে তার ভেতরের সব কাজ)। আর কন্ডিশনটা লিখতে হয় প্রথম বন্ধনীর ভেতরে। if-এর ভেতরে যেই কন্ডিশনটা আছে সেটি যদি মিথ্যা হয়, তবে else-এর ভেতরের (দ্বিতীয় বন্ধনীর ভেতরে) অংশের কাজ হয়। সব প্রোগ্রামিং ল্যাঙ্গুয়েজেই এটি আছে, তবে লিখার ধরন হয়তো আলাদা।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন আমাদের দেখতে হবে, কন্ডিশনগুলো কীভাবে লিখতে হবে? তোমরা এতক্ষণে জেনে গেছ যে 'বড় কিংবা সমান' এই তুলনা করার জন্য &gt;= চিহ্ণ ব্যবহার করা হয়। 'ছোট কিংবা সমান'-এর জন্য ব্যবহার করে &lt;= চিহ্ন। দুটি সংখ্যা একটি আরেকটির সমান কি না সেটি পরীক্ষার জন্য ব্যবহার করে == চিহ্ন (লক্ষ করো এখানে দুটি সমান চিহ্ন আছে। শুরুর দিকে অনেকেই সমান কি না পরীক্ষার জন্য ভুল করে = (একটি সমান চিহ্ন যা দিয়ে আসলে কোনো ভেরিয়েবলে কোনোকিছু অ্যাসাইন করা হয়) ব্যবহার করে বিপদে পড়ে যায়)। দুটি সংখ্যা পরস্পর অসমান কি না, এটি পরীক্ষার জন্য != চিহ্ন ব্যবহার করে। আর ছোট কিংবা বড় পরীক্ষার জন্য &lt; আর &gt; চিহ্ন ব্যবহার করতে হয়। আরও ব্যাপার-স্যাপার আছে। একবারে সব না শিখে চলো আস্তে আস্তে প্রোগ্রাম লিখে শেখা যাক। এখানে ইন্ডেন্টেশনের ব্যাপারটিও কিন্তু খেয়াল কোরো। if কিংবা else-এর ভেতরের ব্লকের সব লাইন কিন্তু if বা else যেখানে শুরু, তার চার ঘর (চারটি স্পেস) ডান থেকে শুরু হয়েছে।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আমরা ওপরের প্রোগ্রামটি এভাবেও লিখতে পারতাম:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int n;     \n" +
                        "     n = 10;   \n" +
                        "     if(n &lt; 0) {   \n" +
                        "         printf(\"The number is negative\\n\");   \n" +
                        "     }   \n" +
                        "     else {   \n" +
                        "         printf(\"The number is positive\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.২  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখানে আমরা প্রথমে পরীক্ষা করেছি যে n শূন্যের চেয়ে ছোট কি না। যদি ছোট হয়, তবে n নেগেটিভ; আর সেটি না হলে (সেটি না হওয়া মানে n অবশ্যই শূন্যের সমান বা বড়) n পজিটিভ।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তোমাদের মধ্যে যারা একটু খুঁতখুঁতে স্বভাবের, তারা নিশ্চয়ই ভাবছ যে শূন্য তো আসলে পজিটিভ বা নেগেটিভ কোনোটাই না। শূন্যের চেয়ে বড় সব সংখ্যা হচ্ছে পজিটিভ আর ছোট সব সংখ্যা হচ্ছে নেগেটিভ। কম্পিউটারকে সেটি বোঝাতে গেলে আমরা নিচের প্রোগ্রামটি লিখতে পারি:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int n = 10;    \n" +
                        "     if(n &lt; 0) {   \n" +
                        "         printf(\"The number is negative\\n\");   \n" +
                        "     }   \n" +
                        "     else if (n &gt; 0) {   \n" +
                        "         printf(\"The number is positive\\n\");   \n" +
                        "     }   \n" +
                        "     else if (n == 0) {  \n" +
                        "         printf(\"The number is zero!\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.৩  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "প্রোগ্রামটি একটু ব্যাখ্যা করা যাক:</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "if(n &lt; 0): এখানে আমরা প্রথমে পরীক্ষা করেছি n শূন্যের চেয়ে ছোট কি না । ছোট হলে তো কথাই নেই। আমরা বলে দিচ্ছি যে সংখ্যাটি নেগেটিভ।  else if(n &gt; 0): আর যদি ছোট না হয়, তবে n শূন্যের চেয়ে বড় কি না সেটি পরীক্ষা করেছি if(n &gt; 0)। এই শর্ত সত্যি হলে সংখ্যাটি পজিটিভ।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "else if(n == 0): আর n &gt; 0ও যদি সত্যি না হয় তবে কোন শর্তটি বাদ রইল? দুটি সমান কি না সেটি পরীক্ষা করা। তাহলে আমরা পরীক্ষা করছি যে n শূন্যের সমান কি না এবং সমান হলে বলে দিচ্ছি যে এটি শূন্য।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "দুটি সংখ্যা তুলনা করার সময় প্রথমটা যদি দ্বিতীয়টির চেয়ে বড় না হয়, ছোটও না হয়, তবে তারা অবশ্যই সমান। তাই তৃতীয় কন্ডিশনটা আসলে আমাদের দরকার নেই। আমরা প্রথম দুটি কন্ডিশন মিথ্যা হলেই বলে দিতে পারি যে n-এর মান শূন্য।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int n = 10;    \n" +
                        "     if(n &lt; 0) {   \n" +
                        "         printf(\"The number is negative\\n\");   \n" +
                        "     }   \n" +
                        "     else if (n &gt; 0) {   \n" +
                        "         printf(\"The number is positive\\n\");   \n" +
                        "     }   \n" +
                        "     else {   \n" +
                        "         printf(\"The number is zero!\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.৪  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আবার সব সময় যে if ব্যবহার করলেই সঙ্গে else কিংবা else if ব্যবহার করতে হবে, এমন কোনো কথা নেই। নিচের প্রোগ্রামটি দেখো:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int number = 12;   \n" +
                        "     if(number &gt; 10) {   \n" +
                        "         printf(\"The number is greater than ten\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.৫  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখানে কেবল দেখা হচ্ছে যে সংখ্যাটির মান কি দশের চেয়ে বড় কি না।  </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "নিচের প্রোগ্রামটি দেখে বলো তো আউটপুট কী হবে?</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int n = 10;  \n" +
                        "     if (n &lt; 30) {  \n" +
                        "         printf(\"n is less than 30.\\n\");  \n" +
                        "     }  \n" +
                        "     else if(n &lt; 50) {  \n" +
                        "         printf(\"n is less than 50.\\n\");  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.৬  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আউটপুট হবে: n is less than 30. যদিও else if(n &lt; 50) এটিও সত্য কিন্তু যেহেতু if (n &lt; 30) সত্য হয়ে গেছে, তাই এর সঙ্গে বাকি যত else if কিংবা else থাকবে, সেগুলো আর পরীক্ষা করা হবে না। এখন তোমরা নিশ্চয়ই নিচের প্রোগ্রামটির আউটপুট বলতে পারবে। </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        "\n" +
                        " int main()  \n" +
                        "\n" +
                        " {  \n" +
                        "\n" +
                        "     int n = 10;  \n" +
                        "\n" +
                        "     if (n &lt; 30) {  \n" +
                        "\n" +
                        "         printf(\"n is less than 30.\\n\");  \n" +
                        "\n" +
                        "     }  \n" +
                        "\n" +
                        "     if(n &lt; 50) {  \n" +
                        "\n" +
                        "         printf(\"n is less than 50.\\n\");  \n" +
                        "\n" +
                        "     }  \n" +
                        "\n" +
                        "     return 0;  \n" +
                        "\n" +
                        " }  \n" +
                        "\n" +
                        " প্রোগ্রাম: ৩.৭  \n" +
                        "\n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন আমরা আরেকটি প্রোগ্রাম লিখব। কোনো সংখ্যা জোড় না বেজোড় সেটি নির্ণয় করার প্রোগ্রাম। কোনো সংখ্যা জোড় কি না সেটি বোঝার উপায় হচ্ছে সংখ্যাটিকে 2দিয়ে ভাগ করা। যদি ভাগশেষ শূন্য হয়, তবে সংখ্যাটি জোড়; আর ভাগশেষ শূন্য না হয়ে এক হলে সেটি বেজোড়। সি ল্যাঙ্গুয়েজে ভাগশেষ বের করার জন্য মডুলাস অপারেটর (modulus operator) আছে, যেটাকে '%' চিহ্ন দিয়ে প্রকাশ করা হয়। তাহলে আর চিন্তা নেই। </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "শুরুতে একটি সংখ্যা নেব: int number;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এবারে number-এর জন্য একটি মান ঠিক করি: number = 5;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন numberকে 2 দিয়ে ভাগ করলে যে ভাগশেষ পাব সেটি বের করি: remainder = number % 2;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন if-এর সাহায্যে remainder-এর মান পরীক্ষা করে আমরা সিদ্ধান্তে পৌঁছে যেতে পারি। remainder-এর কেবল দুটি মানই সম্ভব– 0 আর 1। পুরো প্রোগ্রামটি লিখে ফেলি:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int number, remainder;   \n" +
                        "     number = 5;   \n" +
                        "     remainder = number % 2;   \n" +
                        "     if(remainder == 0) {   \n" +
                        "         printf(\"The number is even\\n\");   \n" +
                        "     }   \n" +
                        "     else {   \n" +
                        "         printf(\"The number is odd\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.৮  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "প্রোগ্রামটি remainder ভেরিয়েবল ব্যবহার না করেও লেখা যায়:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int number = 9;   \n" +
                        "     if(number % 2 == 0) {   \n" +
                        "         printf(\"The number is even\\n\");   \n" +
                        "     }   \n" +
                        "     else {   \n" +
                        "         printf(\"The number is odd\\n\");   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.৯  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আচ্ছা, আমাদের যদি কেবল জোড় সংখ্যা নির্ণয় করতে হতো, তাহলে আমরা কী করতাম? else ব্লকটা বাদ দিয়ে দিতাম।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তোমাদের জন্য এখন একটি ছোট্ট পরীক্ষা। মডুলাস অপারেটর ব্যবহার না করে ভাগশেষ বের করতে পারবে? একবার করে গুণ, ভাগ ও বিয়োগ (*, /, -) ব্যবহার করে কিন্তু কাজটি করা যায়। তোমরা সেটি করার চেষ্টা করতে পারো।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এবার আরেকটি প্রোগ্রাম দেখা যাক। কোনো একটি অক্ষর ছোট হাতের (small letter বা lower case letter) নাকি বড় হাতের (capital letter বা upper case letter), সেটি বের করতে হবে। এর জন্য সবচেয়ে সহজ সমাধানটা হতে পারে এই রকম যে আমরা একটি character টাইপের ভেরিয়েবলের ভেতরে অক্ষরটা রাখতে পারি। তারপর একে একে সেটিকে 26টি lower case letter এবং 26টি upper case letter-এর সঙ্গে তুলনা করে দেখতে পারি। যখনই মিলে যাবে, তখনই বলে দেওয়া যায়, অক্ষরটা কোন ধরনের।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> char ch = 'p';  \n" +
                        " if (ch == 'a')  \n" +
                        " {  \n" +
                        "     printf(\"%c is lower case\\n\", ch);  \n" +
                        " }  \n" +
                        " else if (ch == 'A')  \n" +
                        " {  \n" +
                        "     printf(\"%c is upper case\\n\", ch);  \n" +
                        " }  \n" +
                        " else if (ch == 'b')  \n" +
                        " {  \n" +
                        "     printf(\"%c is lower case\\n\", ch);  \n" +
                        " }  \n" +
                        " else if (ch == 'B')  \n" +
                        " {  \n" +
                        "     printf(\"%c is upper case\\n\", ch);  \n" +
                        " }    \n" +
                        " else if (ch == 'c')  \n" +
                        " {  \n" +
                        "     printf(\"%c is lower case\\n\", ch);  \n" +
                        " }  \n" +
                        " else if (ch == 'C')  \n" +
                        " {  \n" +
                        "     printf(\"%c is upper case\\n\", ch);  \n" +
                        " }  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "… এভাবে চলবে।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "কিন্তু এই সমস্যার সমাধান করার জন্য এত কোড লিখার কোনো দরকার নেই। এটি সহজে করার জন্য আমাদের জানতে হবে এন্ড অপারেটরের (AND operator) ব্যবহার। সি ল্যাঙ্গুয়েজে একে '&amp;&amp;' চিহ্ন দিয়ে প্রকাশ করা হয়। নিচের কোডটি দেখলেই তোমরা এর কাজ বুঝে যাবে।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     char ch = 'W';  \n" +
                        "     if(ch &gt;= 'a' &amp;&amp; ch &lt;= 'z') {  \n" +
                        "         printf(\"%c is lower case\\n\", ch);  \n" +
                        "     }  \n" +
                        "     if(ch &gt;= 'A' &amp;&amp; ch &lt;= 'Z') {  \n" +
                        "         printf(\"%c is upper case\\n\", ch);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.১০  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "'&amp;&amp;'-এর বাঁ পাশে একটি কন্ডিশন এবং ডান পাশে একটি কন্ডিশন থাকবে, এবং দুটি কন্ডিশন সত্য হলেই সম্পূর্ণ কন্ডিশনটা সত্য হবে। ch &gt;= 'a' &amp;&amp; ch &lt;= 'z' এটি পুরোটা একটি কন্ডিশন। এখন &amp;&amp;-এর বাঁ দিকে একটি কন্ডিশন আছে ch &gt;= 'a' আর ডানদিকে আরেকটি কন্ডিশন ch &lt;= 'z'। দুটি কন্ডিশনই যদি সত্য হয়, তবে পুরো কন্ডিশনটা সত্য হবে। এখন কম্পিউটার প্রতিটি অক্ষর বোঝার জন্য যেই কোড ব্যবহার করে তাতে a-এর চেয়ে b-এর মান এক বেশি, b-এর চেয়ে c-এর মান এক বেশি, c-এর চেয়ে d-এর মান এক বেশি … এরকম। তাই কোনো অক্ষর lower case হলে সেটি অবশ্যই 'a'-এর সমান কিংবা বড় হতে হবে। আবার সেটি 'z'-এর সমান কিংবা ছোট হতে হবে। একইভাবে A-এর চেয়ে B-এর মান এক বেশি, B-এর চেয়ে C-এর মান এক বেশি … এরকম। তাই কোনো ক্যারেক্টারের মান 'A' থেকে 'Z'-এর মধ্যে হলে আমরা বলতে পারি যে সেটি upper case। 'A'-এর সমান কিংবা বড় হতে হবে এবং 'Z'-এর সমান কিংবা ছোট হতে হবে।  আরেকটি ব্যাপার। দ্বিতীয় if-এর আগে else ব্যবহার করা উচিত। তাহলে কম্পাইলার প্রথম if-এর ভেতরের শর্ত সত্য হলে আর পরের if-এর কন্ডিশন পরীক্ষা করবে না। তাতে সময় বাঁচবে। </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        "\n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     char ch = 'k';  \n" +
                        "     if(ch &gt;= 'a' &amp;&amp; ch &lt;= 'z') {  \n" +
                        "         printf(\"%c is lower case\\n\", ch);  \n" +
                        "     }  \n" +
                        "     else if(ch &gt;= 'A' &amp;&amp; ch &lt;= 'Z') {  \n" +
                        "         printf(\"%c is upper case\\n\", ch);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.১১  \n" +
                        "\n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আশা করি, তোমরা '&amp;&amp;'-এর ব্যবহার বুঝে গেছ। </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন আরেকটি অপারেটরের ব্যবহার দেখব। সেটি হচ্ছে অর (OR)। একে প্রকাশ করা হয় '||' চিহ্ন দিয়ে (পরপর দুটি |)। '&amp;&amp;'-এর ক্ষেত্রে যেমন দুই পাশের শর্ত সত্য হলেই সম্পূর্ণ শর্ত সত্য হয়, '||'-এর ক্ষেত্রে যেকোনো এক পাশের শর্ত সত্য হলেই সম্পূর্ণ শর্ত সত্য হয়। </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "নিচের প্রোগ্রামটির আউটপুট কী হবে? কোড দেখে বলতে না পারলে প্রোগ্রামটি চালাও।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int num = 5;  \n" +
                        "     if(num &gt;= 1 || num &lt;= 10) {  \n" +
                        "         printf(\"yes\\n\");  \n" +
                        "     }  \n" +
                        "     else {  \n" +
                        "         printf(\"no\\n\");  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৩.১২  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এটির আউটপুট হবে yes। এখন num-এর মান 50 করে দাও। আউটপুট কী হবে?</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এবারেও আউটপুট yesই হবে। কারণ num-এর মান 50 হলে, প্রথম শর্তটি সত্য হবে (num &gt;= 1) আর দ্বিতীয় শর্তটি (n &lt;= 10) মিথ্যা হবে। তবে আমরা যেহেতু দুটি শর্তের মাঝে '||' ব্যবহার করেছি, তাই যেকোনো একটি শর্ত সত্য হলেই সম্পূর্ণ শর্তটি সত্য হবে। এখন আরও একটি সমস্যা। কোনো অক্ষর vowel নাকি consonant, সেটি নির্ণয় করতে হবে।   আমরা জানি, vowelগুলো হচ্ছে a, e, i, o, u। এখন কোনো ক্যারেক্টার এই পাঁচটির মধ্যে পড়ে কি না সেটি নির্ণয় করার জন্য যদি আমরা এমন শর্ত দিই: ch &gt;= 'a' &amp;&amp; ch &lt;= 'u' তাহলে কিন্তু হবে না। কারণ তাহলে a থেকে u পর্যন্ত সব অক্ষরের জন্যই শর্তটি সত্যি হবে কিন্তু আমাদের দরকার নির্দিষ্ট কিছু অক্ষর। তাই শর্তটি আমরা এভাবে লিখতে পারি: </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {  \n" +
                        "     printf(\"%c is vowel\\n\", ch);  \n" +
                        " }  \n" +
                        " else {  \n" +
                        "     printf(\"%c is consonant\\n\", ch);  \n" +
                        " }  \n" +
                        "\n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তাহলে এবার সম্পূর্ণ প্রোগ্রামটি তোমরা লিখে ফেলতে পারো।<br>\n" +
                        "<br>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div style=\"clear: both;\"></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>\n",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
