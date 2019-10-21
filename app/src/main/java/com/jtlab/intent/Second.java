package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Second extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় দুই");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView = (HtmlTextView) findViewById(R.id.html_text);
        htmlTextView.setHtml("<html lang=\"en\">\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"post hentry\">\n" +
                "<a name=\"2177483248701238758\"></a>\n" +
                "<h3 class=\"post-title entry-title\">\n" +
                "[প্রোগ্রামিং বইঃ অধ্যায় দুই] ডাটা টাইপ, ইনপুট ও আউটপুট।\n" +
                "</h3>\n" +
                "<div class=\"post-header\">\n" +
                "<div class=\"post-header-line-1\"></div>\n" +
                "</div>\n" +
                "<div class=\"post-body entry-content\" id=\"post-body-2177483248701238758\">\n" +
                "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এ অধ্যায়ে আমরা কিছু ছোট ছোট প্রোগ্রাম লিখব। সবগুলো প্রোগ্রাম অবশ্যই কম্পিউটারে চালিয়ে দেখবে এবং একটু পরিবর্তন করে কম্পাইল ও রান করার চেষ্টা করবে।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "আমাদের প্রথম প্রোগ্রামটি হবে দুটি সংখ্যা যোগ করার প্রোগ্রাম। এখন কথা হচ্ছে, সংখ্যাগুলো তো কম্পিউটারের মেমোরিতে রাখতে হবে, সেই জটিল কাজটি কীভাবে করব? চিন্তা নেই! সব প্রোগ্রামিং ল্যাঙ্গুয়েজে ভেরিয়েবল বলে একটি জিনিস আছে যেটি কোন নির্দিষ্ট মান ধারণ করার জন্য ব্যবহার করা হয়। ভেরিয়েবলের একটি নাম দিতে হয়, তারপর ভেরিয়েবল = কোনো মান&nbsp; লিখে দিলে ভেরিয়েবলের ভেতর সেটি ঢুকে যায়। এটির সঙ্গে গাণিতিক সমীকরণের কিন্তু কোনো সম্পর্ক নেই। চলো, প্রোগ্রামটি লিখে রান করাই, তারপর ব্যাখ্যা করা যাবে।</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a;  \n" +
                "     int b;  \n" +
                "     int sum;  \n" +
                "     a = 50;  \n" +
                "     b = 60;  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"Sum is %d\", sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "প্রোগ্রামটি রান করাও, তুমি স্ক্রিনে দেখবে: Sum is 110।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখানে a, b, sum তিনটি ভেরিয়েবল (variable) আলাদা সংখ্যা ধারণ করে। প্রথমে আমাদের বলে দিতে হবে যে a, b, sum নামে তিনটি ভেরিয়েবল আছে। এবং এগুলোতে কী ধরনের ডাটা থাকবে সেটিও বলে দিতে হবে। int a; দিয়ে আমরা কম্পাইলারকে বলছি a নামে একটি ভেরিয়েবল এই প্রোগ্রামে আছে যেটি একটি পূর্ণসংখ্যা (integer)-এর মান ধারণ করার জন্য ব্যবহার করা হবে। এই কাজটিকে বলে ভেরিয়েবল ডিক্লারেশন। আর int হচ্ছে ডাটা টাইপ, যেটি দেখে সি-এর কম্পাইলার বুঝবে যে এতে ইন্টিজার টাইপ ডাটা থাকবে। আরও বেশ কিছু ডাটা টাইপ আছে, সেগুলো আমরা আস্তে আস্তে দেখব। আমরা চাইলে একই টাইপের ভেরিয়েবলগুলো ডিক্লেয়ার করার সময় আলাদা লাইনে না লিখে একসঙ্গে কমা দিয়েও লিখতে পারতাম, যেমন: int a, b, sum;। আর লক্ষ করো যে ভেরিয়েবল ডিক্লারেশনের শেষে সেমিকোলন ব্যবহার করতে হয়। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এরপর আমি দুটি স্টেটমেন্ট লিখেছি:</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "a = 50;</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "b = 60;</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখানে a-এর মান 50 আর b-এর মান 60 বলে দিলাম (assign করলাম), যতক্ষণ না এটি আমরা পরিবর্তন করছি, কম্পাইলার a-এর মান 50 আর b-এর মান 60 ধরবে।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "পরের স্টেটমেন্ট হচ্ছে: sum = a + b;। এতে বোঝায়, sum-এর মান হবে a + b-এর সমান, অর্থাৎ a ও b-এর যোগফল যে সংখ্যাটি হবে সেটি আমরা sum নামের ভেরিয়েবলে রেখে দিলাম (বা assign করলাম)। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এবারে যোগফলটি মনিটরে দেখাতে হবে, তাই আমরা printf ফাংশন ব্যবহার করব।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "printf(\"Sum is %d\", sum);</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখানে দেখো printf ফাংশনের ভেতরে দুটি অংশ। প্রথম অংশে \"Sum is %d\" দিয়ে বোঝানো হয়েছে স্ক্রিনে প্রিন্ট করতে হবে Sum is এবং তার পরে একটি ইন্টিজার ভেরিয়েবলের মান যেটি %d-এর জায়গায় বসবে। তারপর কমা দিয়ে আমরা sum লিখে বুঝিয়ে দিয়েছি যে %d-তে sum-এর মান প্রিন্ট করতে হবে। ইন্টিজারের জন্য যেমন %d ব্যবহার করলাম, অন্য ধরনের ভেরিয়েবলের জন্য অন্য কিছু লিখতে হবে, যেটি আমরা ব্যবহার করতে করতে শিখব। খুব ভালো হতো যদি আমি এখন একটি চার্ট লিখে দিতাম যে সি ল্যাঙ্গুয়েজে কী কী ডাটা টাইপ আছে, সেগুলো কী দিয়ে লেখে এবং প্রিন্ট করার জন্য কী করতে হবে আর তোমরা সেই চার্ট মুখস্থ করে ফেলতে। কিন্তু শুধু শুধু মুখস্থ করার কোনো দরকার নেই, মুখস্থ করার প্রবণতা চিন্তাশক্তি কমায় আর প্রোগ্রামারদের জন্য চিন্তা করার ক্ষমতা খুবই গুরুত্বপূর্ণ।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "আমরা ওপরের প্রোগ্রামটি চাইলে এভাবেও লিখতে পারতাম:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a, b, sum;  \n" +
                "     a = 50;  \n" +
                "     b = 60;  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"Sum is %d\", sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.২  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "আবার ভেরিয়েবল ডিক্লেয়ার করার সময় একই সঙ্গে অ্যাসাইনও করা যায়:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a = 50, b = 60, sum;  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"Sum is %d\", sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৩  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখন তোমাদের জন্য একটি প্রশ্ন। নিচের প্রোগ্রামটির আউটপুট কী হবে?</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()   \n" +
                " {  \n" +
                "     int x, y;  \n" +
                "     x = 1;  \n" +
                "     y = x;  \n" +
                "     x = 2;  \n" +
                "     printf(\"%d\", y);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৪  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "কী মনে হয়? আউটপুট 1 নাকি 2? আউটপুট হবে 1, কারণ প্রথমে কম্পাইলার দেখবে, x-এর মান 1 অ্যাসাইন করা হয়েছে (x = 1;)। তারপর x-এর মানটি আবার y-এ অ্যাসাইন করা হয়েছে (y = x;)। এখন y-এর মান 1। তারপর আবার x-এর মান 2 অ্যাসাইন করা হয়েছে। কিন্তু তাতে y-এর মানের কোনো পরিবর্তন হবে না। প্রোগ্রামিংয়ে y = x; আসলে কোনো সমীকরণ না যে এটি সবসময় সত্য হবে। '=' চিহ্ন দিয়ে একটি ভেরিয়েবলে নির্দিষ্ট কোনো মান রাখা হয়।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এবারে নিচের প্রোগ্রামটি দেখো:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a = 50, b = 60, sum;  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"%d + %d = %d\", a, b, sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৫  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "প্রোগ্রামটি মনিটরে কী প্রিন্ট করে? চালিয়ে দেখো। printf(\"%d + %d = %d\", a, b, sum); না লিখে printf(\"%d + %d = %d\", b, a, sum); লিখে প্রোগ্রামটি আবার চালাও। এখন জিনিসটি চিন্তা করে বুঝে নাও।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "লেখাপড়া করার সময় আমাদের মনে নানা বিষয়ে নানা প্রশ্ন আসে, যার উত্তর আমরা বইতে খুঁজি, শিক্ষককে জিজ্ঞাসা করি, ইন্টারনেটে খুঁজি বা চিন্তা করে যুক্তি দাঁড় করিয়ে উত্তরটি বের করি। আমাদের দুর্ভাগ্য যে বেশিরভাগ ছেলেমেয়েই শেষ কাজটি করে না, কারণ নিজে নিজে চিন্তা করতে একটু সময় লাগে ও পরিশ্রম হয়, সেই সময় আর শ্রম তারা দিতে চায় না। আর আমাদের অভিভাবক, শিক্ষক ও শিক্ষাব্যবস্থা চিন্তা করার জন্য কোনো পুরস্কার দেয় না, বরং মুখস্থ করার জন্যই পুরস্কৃত করে। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "যা-হোক, প্রোগ্রামিংয়ের ব্যাপারে যখনই মনে কোনো প্রশ্ন আসবে, সঙ্গে সঙ্গে একটি প্রোগ্রাম লিখে ফেলবে। দেখো তোমার কম্পাইলার কী বলে। ধরা যাক, আমরা যদি int টাইপের ভেরিয়েবলে দশমিক যুক্ত সংখ্যা (বাস্তব সংখ্যা বা real number) ব্যবহার করতাম, তাহলে কী হতো?</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a = 50.45, b = 60, sum;  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"%d + %d = %d\", a, b, sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৬  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখানে a-এর মান 50.45 ব্যবহার করলাম। এবারে প্রোগ্রাম চালাও, দেখো কী হয়। আবার মনে যদি প্রশ্ন আসে যে, main ফাংশনের শেষ লাইনে return 0; না লিখলে কী হয়? তাহলে return 0; ছাড়া প্রোগ্রাম চালিয়ে দেখো কী হয়।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "আউটপুট হবে: 50 + 60 = 110।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "সি কম্পাইলার a-এর মান 50 ধরেছে, যদিও আমরা 50.45 অ্যাসাইন করেছি। এই ব্যাপারটিকে বলে টাইপ কাস্ট (type cast)। বাস্তব সংখ্যা রাখার জন্য সি ভাষায় double নামের ডাটা টাইপ রয়েছে। টাইপ কাস্ট করে double সংখ্যাটিকে int-এ নেওয়া হয়েছে, এটি অটোমেটিক হয়। আবার কম্পাইলারকে বলেও দেওয়া যায়: int a = (int) 50.45। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "int a = 50.99; এখানে a-এর মান হবে 50। int a = -50.9; লিখলে a-এর মান হয় -50। এক কথায় বললে double থেকে int-এ টাইপ কাস্ট করলে দশমিকের পরের অংশটি বাদ পড়ে যাবে।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "আরেকটি কথা। যেই ভেরিয়েবলকে টাইপ কাস্ট করা হচ্ছে, তার মান কিন্তু পরিবর্তন হয় না। টাইপ কাস্ট করা মানটি একটি ভেরিয়েবলে রাখা যায়। নিচের প্রোগ্রামটি কম্পিউটারে চালালেই বুঝতে পারবে।</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int n;  \n" +
                "     double x;  \n" +
                "     x = 10.5;  \n" +
                "     n = (int)x;  \n" +
                "     printf(\"Value of n is %d\\n\", n);  \n" +
                "     printf(\"Value of x is %lf\\n\", x);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৭  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "প্রোগ্রামের আউটপুট দেখো। x-এর মান কিন্তু পরিবর্তন হয়নি। আর বুঝতেই পারছ যে বাস্তব সংখ্যা রাখার জন্য সি-তে যে double টাইপের ভেরিয়েবল ব্যবহার করা হয়, তা প্রিন্ট করার সময় %lf (l এখানে ইংরেজি ছোট হাতের L) ব্যবহার করতে হয়। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "int ডাটা টাইপে তো কেবল পূর্ণ সংখ্যা রাখা যায়। কিন্তু সেটি কী যেকোনো পূর্ণসংখ্যা? উত্তরের জন্য একটি প্রোগ্রাম লিখি:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a;  \n" +
                "     a = 1000;  \n" +
                "     printf(\"Value of a is %d\", a);  \n" +
                "     a = -21000;  \n" +
                "     printf(\"Value of a is %d\", a);  \n" +
                "     a = 10000000;  \n" +
                "     printf(\"Value of a is %d\", a);  \n" +
                "     a = -10000000;  \n" +
                "     printf(\"Value of a is %d\", a);  \n" +
                "     a = 100020004000503;  \n" +
                "     printf(\"Value of a is %d\", a);  \n" +
                "     a = -4325987632;  \n" +
                "     printf(\"Value of a is %d\", a);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৮  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখানে আমরা a-তে বিভিন্ন সংখ্যা অ্যাসাইন করলাম। সব মান কি ঠিকঠাক আসছে? আসেনি। কেন আসেনি সেটি ব্যাখ্যা করার আগে একটি কথা বলে নিই। পরপর এতগুলো printf-এর কারণে তোমার কম্পিউটারের স্ক্রিনে নিশ্চয়ই দেখতে একটু অস্বস্তিকর লাগছে। প্রতিটি printf তোমরা এভাবে লিখতে পারো: printf(\"Value of a is %d\\n\", a);। এখন printf ফাংশনে \"\"-এর ভেতর \\n লিখলে কী হয় সেটি আমি বলব না। প্রোগ্রামটি চালালেই বুঝতে পারবে।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "a-এর সবগুলো মান কিন্তু ঠিকভাবে দেখা যায়নি, যেসব মান -2147483648 থেকে 2147483647 পর্যন্ত কেবল সেগুলোই ঠিকঠাক প্রিন্ট হবে, কারণ এই রেঞ্জের বাইরের সংখ্যা int টাইপের ভেরিয়েবলে রাখা যায় না। এটি হলো int টাইপের সংখ্যার সীমা। সি-তে int টাইপের ডাটার জন্য মেমোরিতে চার বাইট (byte) জায়গা ব্যবহৃত হয়। চার বাইট মানে বত্রিশ বিট (1 byte = 8 bit)। প্রতি বিটে দুটি জিনিস রাখা যায়, 0 আর 1। দুই বিটে রাখা যায় চারটি সংখ্যা (00, 01, 10, 11)। তাহলে 32 বিটে রাখা যাবে: 2^32 টা সংখ্যা অর্থাৎ 4294967296টি সংখ্যা। এখন অর্ধেক ধনাত্মক আর অর্ধেক ঋণাত্মক যদি রাখি, তাহলে -2147483648 থেকে -1 পর্যন্ত মোট 2147483648 সংখ্যা আবার 0 থেকে 2147483647 পর্যন্ত  মোট 2147483648টি সংখ্যা, সর্বমোট  4294967296টি সংখ্যা। আশা করি, হিসাবটা বুঝতে পেরেছ।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখন আমরা যোগ করার প্রোগ্রামটি লিখব যেটি সব বাস্তব সংখ্যা (real number) যোগ করতে পারবে। তোমাদের মনে করিয়ে দিই, পূর্ণসংখ্যা হচ্ছে, ... -3, -2, -1, 0, 1, 2, 3 ... ইত্যাদি। আর বাস্তব সংখ্যা হচ্ছে -5, -3, -2.43, 0, 0.49, 2.92 ইত্যাদি (সংখ্যারেখার ওপর সব সংখ্যাই কিন্তু বাস্তব সংখ্যা)।</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     double a, b, sum;  \n" +
                "     a = 9.5;  \n" +
                "     b = 8.743;  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"Sum is: %lf\\n\", sum);  \n" +
                "     printf(\"Sum is: %0.2lf\\n\", sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.৯  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "প্রোগ্রামটি কম্পাইল এবং রান করো। আউটপুট হবে নিচের দুই লাইন:</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Sum is: 18.243000</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "Sum is: 18.24</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "%lf ব্যবহার করায় প্রথম লাইনে দশমিকের পরে ছয় ঘর পর্যন্ত প্রিন্ট হয়েছে। আবার দ্বিতীয় লাইনে দশমিকের পরে দুই ঘর পর্যন্ত প্রিন্ট হয়েছে, কারণ %0.2lf লিখেছি (তিন ঘর পর্যন্ত প্রিন্ট করতে চাইলে %0.3lf লিখতাম, আবার দশমিক অংশ প্রিন্ট করতে না চাইলে %0.0lf)। double টাইপের ডাটার জন্য 64 বিট ব্যবহৃত হয় এবং 1.7E-308 (1.7 x 10-308) থেকে 1.7E+308 (1.7 x 10308) পর্যন্ত ডাটা রাখা যায়। বিস্তারিত হিসাব বুঝতে হলে কম্পিউটার বিজ্ঞানসংক্রান্ত আরও কিছু জ্ঞানবুদ্ধির দরকার, তাই আমি আর এখন সেদিকে যাচ্ছি না। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখন আমরা আমাদের প্রোগ্রামে এমন ব্যবস্থা রাখতে চাই, যাতে কোন দুটি সংখ্যা যোগ করতে হবে সেটি আমরা কোডের ভেতর লিখব না, ব্যবহারকারীর কাছ থেকে ইনপুট আকারে জেনে নেব। ব্যবহারকারীর (মানে যে প্রোগ্রামটি ব্যবহার করছে) কাছ থেকে ইনপুট নেওয়ার জন্য আমরা scanf ফাংশন ব্যবহার করব (সি-তে আরও ফাংশন আছে এই কাজের জন্য)। তাহলে দেরি না করে প্রোগ্রাম লিখে ফেলি:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a, b, sum;  \n" +
                "     scanf(\"%d\", &amp;a);  \n" +
                "     scanf(\"%d\", &amp;b);  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"Sum is: %d\\n\", sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১০  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "প্রোগ্রামটি রান করলে দেখবে ফাঁকা স্ক্রিন (blank screen) আসে। তখন তুমি একটি সংখ্যা লিখবে, তারপর স্পেস (space) বা এন্টার (enter) দিয়ে আরেকটি সংখ্যা লিখবে। তারপর আবার এন্টার চাপলে যোগফল দেখতে পাবে। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "তোমরা নিশ্চয়ই scanf ফাংশনের ব্যবহার শিখে ফেলেছ। scanf(\"%d\", &amp;a); এখানে ডবল কোটেশনের ভেতরে %d দিয়ে scanf-কে বলে দেওয়া হচ্ছে যে একটি ইন্টিজার বা int টাইপের ভেরিয়েবলের মান পড়তে হবে (ব্যবহারকারী কিবোর্ড থেকে ইনপুট দেবে)। আর দেখো a-এর আগে এমপারসেন্ড (&amp;) চিহ্ন ব্যবহার করা হয়েছে, &amp;a দিয়ে বোঝানো হয়েছে যে সংখ্যাটি ইনপুট দেওয়া হবে সেটি a ভেরিয়েবলের মাঝে অ্যাসাইন হবে। তোমরা যখন সি আরেকটু ভালোভাবে শিখবে, তখন &amp;a-এর প্রকৃত অর্থ বুঝতে পারবে, আপাতত আমরা ব্যবহারের দিকেই মনোযোগ দিই। a এবং b-এর মান একটি scanf ফাংশন দিয়েও নেওয়া যেত এভাবে: scanf(\"%d %d\", &amp;a, &amp;b);। ভেরিয়েবলের আগে &amp; চিহ্ন না দিলে কী সমস্যা? নিচের প্রোগ্রামটি রান করার চেষ্টা করো, কিছু একটি এরর পাবে। এই মুহূর্তে এররটা ব্যাখ্যা করছি না, কারণ ব্যাখ্যাটা একটু জটিল আর এখন বোঝাতে গেলে তোমরা ভুল বুঝতে পারো এবং পরে আমাকে গালমন্দ করবে।</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int a, b, sum;  \n" +
                "     scanf(\"%d\", &amp;a);  \n" +
                "     scanf(\"%d\", b);  \n" +
                "     sum = a + b;  \n" +
                "     printf(\"Sum is: %d\\n\", sum);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১১  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখন আমরা যদি ইনপুট হিসেবে ইন্টিজার না নিয়ে ডবল টাইপের ডাটা নিতে চাইতাম তাহলে কী করতে হতো? scanf-এ %d-এর বদলে %lf ব্যবহার করলেই চলত। তোমরা প্রোগ্রামটি লিখে ফেলো এবং দেখো ঠিকঠাক রান হয় কি না। তারপরে বাকি অংশ পড়া শুরু করো। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "আসলে ঠিকঠাক রান হবে না, কারণ ডাটা টাইপও পরিবর্তন করতে হবে। মানে int না লিখে double লিখতে হবে। প্রোগ্রামটি ঠিক করে আবার চালাও।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "বইতে যখনই আমি কোনো প্রোগ্রাম লেখতে বলব সেটি যত সহজ কিংবা কঠিনই মনে হোক না কেন, সেটি কম্পিউটারে লিখে কম্পাইল ও রান করতে হবে। এ কাজ না করে সামনে আগানো যাবে না। মনে রাখবে, গাড়ি চালানো শেখার জন্য যেমন গাড়ি চালানোর কোনো বিকল্প নেই, সাঁতার শেখার জন্য যেমন সাঁতার কাটার বিকল্প নেই, তেমনই প্রোগ্রামিং শেখার জন্য প্রোগ্রামিং করার কোনো বিকল্প নেই, শুধু বই পড়ে প্রোগ্রামার হওয়া যায় না।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এবারে আমরা আরেক ধরনের ডাটা টাইপ দেখব, সেটি হচ্ছে char (character) টাইপ। তো এই character টাইপের চরিত্র হচ্ছে একে মেমোরিতে রাখার জন্য মাত্র এক বাইট জায়গার দরকার হয়। সাধারণত যেকোনো অক্ষর বা চিহ্ন রাখার জন্য এই টাইপের ডাটা ব্যবহার করা হয়। তবে সেই অক্ষরটা ইংরেজি বর্ণমালার অক্ষর হতে হবে, অন্য ভাষার অক্ষর char টাইপের ভেরিয়েবলে রাখা যাবে না। নিচের প্রোগ্রামটি কম্পিউটারে লিখে রান করাও:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     char ch;  \n" +
                "     printf(\"Enter the first letter of your name: \");  \n" +
                "     scanf(\"%c\", &amp;ch);  \n" +
                "     printf(\"The first letter of your name is: %c\\n\", ch);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১২  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "কোড দেখে বুঝতেই পারছ, char টাইপের জন্য printf এবং scanf ফাংশনের ভেতরে %c ব্যবহার করতে হয়। আরেকটি ফাংশন আছে getchar, এটি দিয়েও char টাইপের ডাটা রিড করা যায়। নিচের প্রোগ্রামটি দেখো:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     char ch;  \n" +
                "     printf(\"Enter the first letter of your name: \");  \n" +
                "     ch = getchar();  \n" +
                "     printf(\"The first letter of your name is: %c\\n\", ch);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১৩  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এটি রান করাও। আগের প্রোগ্রামটির মতো একই কাজ করবে। getchar ফাংশন একটি অক্ষর পড়ে সেটি ch ভেরিয়েবলের ভেতরে অ্যাসাইন করে দিল। আর সরাসরি কোনো কিছু char টাইপ ভেরিয়েবলে রাখতে চাইলে যেই অক্ষর বা চিহ্ন রাখবে তার দুই পাশে সিঙ্গেল কোটেশন চিহ্ন দেবে। যেমন: char c = 'A';</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখন নিচের প্রোগ্রামটি দেখো:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int num1, num2;  \n" +
                "     printf(\"Please enter a number: \");  \n" +
                "     scanf(\"%d\", &amp;num1);  \n" +
                "     printf(\"Please enter another number: \");  \n" +
                "     scanf(\"%d\", &amp;num2);  \n" +
                "     printf(\"%d + %d = %d\\n\", num1, num2, num1+num2);  \n" +
                "     printf(\"%d - %d = %d\\n\", num1, num2, num1-num2);  \n" +
                "     printf(\"%d * %d = %d\\n\", num1, num2, num1*num2);  \n" +
                "     printf(\"%d / %d = %d\\n\", num1, num2, num1/num2);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১৪  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এটি কম্পাইল ও রান করাও। এটি দেখে নিশ্চয়ই বুঝতে পারছ বিয়োগ, গুণ ও ভাগের কাজ কীভাবে করতে হয়। এবারে তোমাদের কাজ হচ্ছে চারটি। এক, num1 ও num2-এর মধ্যেকার যোগ, বিয়োগ, গুণ, ভাগের কাজটি printf ফাংশনের ভেতরে না করে আগে করা এবং মানটি অন্য একটি ভেরিয়েবলে রেখে দেওয়া। এর জন্য একটি প্রোগ্রাম লিখে ফেলো। দ্বিতীয় কাজ হচ্ছে প্রোগ্রামটি ডবল টাইপের ভেরিয়েবল ব্যবহার করে করো। তৃতীয় কাজ হচ্ছে, num2-এর মান 0 দিয়ে দেখো কী হয়। চতুর্থ কাজটি হচ্ছে printf ফাংশনের ভেতরে ডবল কোটেশনের ভেতরে যেই +, -, *, / চিহ্ন আছে সেগুলো সরাসরি ব্যবহার না করে একটি char টাইপ ভেরিয়েবলে রেখে তারপর ব্যবহার করা। চারটি কাজ ঠিকমতো করার পরে নিচের প্রোগ্রামটি দেখো:</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     int num1, num2, value;  \n" +
                "     char sign;  \n" +
                "     printf(\"Please enter a number: \");  \n" +
                "     scanf(\"%d\", &amp;num1);  \n" +
                "     printf(\"Please enter another number: \");  \n" +
                "     scanf(\"%d\", &amp;num2);  \n" +
                "     value = num1 + num2;  \n" +
                "     sign = '+';  \n" +
                "     printf(\"%d %c %d = %d\\n\", num1, sign, num2, value);  \n" +
                "     value = num1 - num2;  \n" +
                "     sign = '-';  \n" +
                "     printf(\"%d %c %d = %d\\n\", num1, sign, num2, value);  \n" +
                "     value = num1 * num2;  \n" +
                "     sign = '*';  \n" +
                "     printf(\"%d %c %d = %d\\n\", num1, sign, num2, value);  \n" +
                "     value = num1 / num2;  \n" +
                "     sign = '/';  \n" +
                "     printf(\"%d %c %d = %d\\n\", num1, sign, num2, value);  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১৫  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "প্রোগ্রামটি দেখলেই বুঝতে পারবে কী কাজ করে। তবে শুধু দেখে বুঝলেই হবে না। কোড করে কম্পাইল ও রান করো। </div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "সি ল্যাঙ্গুয়েজে আরও বেশ কিছু ডাটা টাইপ রয়েছে। ইনপুট ও আউটপুটের জন্যও রয়েছে নানা পদ্ধতি, যা তোমরা আস্তে আস্তে শিখবে (সব হয়তো এ বইয়ে থাকবে না, সি-এর অন্য বই পড়লে জানতে পারবে)। আপাতত যা শিখেছ, তা দিয়েই তোমরা অনেক প্রোগ্রাম লিখে ফেলতে পারবে।</div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "<br></div>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এখন একটি মজার এবং দরকারি জিনিস বলে রাখি। প্রোগ্রামের কোডের ভেতরে তুমি নিজের ভাষাও ব্যবহার করতে পারো। এটিকে বলে কমেন্ট (comment) করা। কম্পাইলার কমেন্টগুলোকে প্রোগ্রামের অংশ ধরবে না। এক লাইনের কমেন্ট হলে // চিহ্ন দিয়ে কমেন্ট শুরু করতে পারো। আর একাধিক লাইন থাকলে /* দিয়ে শুরু এবং */ দিয়ে শেষ করতে হবে। নিচের প্রোগ্রামটি কিন্তু ঠিকঠাক কম্পাইল ও রান হবে।</div>\n" +
                "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                " int main()  \n" +
                " {  \n" +
                "     // test program - comment 1  \n" +
                "     printf(\"Hello \");  \n" +
                "     /* We have printed Hello,  \n" +
                "     now we shall print World.  \n" +
                "     Note that this is a multi-line comment */  \n" +
                "     printf(\"World\"); // printed world  \n" +
                "     return 0;  \n" +
                " }  \n" +
                " প্রোগ্রাম: ২.১৬  \n" +
                "</code></pre>\n" +
                "<div style=\"text-align: justify;\">\n" +
                "এবারে একটি প্রশ্ন, (যেটি সি-এর টেক্সট বইয়ে এই চ্যাপ্টারের শুরুতেই বলে দিত), ভেরিয়েবলগুলোর নামকরণের নিয়মকানুন কী? ভেরিয়েবলের নাম এক বা একাধিক অক্ষরের হতে পারে, অক্ষরগুলো হতে পারে a থেকে z, A থেকে Z, 0 থেকে 9 এবং _ (আন্ডারস্কোর বা আন্ডারবার)। তবে একাধিক অক্ষরের ক্ষেত্রে প্রথম অক্ষরটা অঙ্ক (ডিজিট) হতে পারবে না। তুমি একটি প্রোগ্রামে int 7d; লিখে দেখো কম্পাইলার কী বলে। আর ভেরিয়েবলের নামগুলো অর্থপূর্ণ হলে ভালো হয়। যেমন, যোগফল রাখার জন্য ভেরিয়েবলের নাম sum হলেই ভালো, যদিও y নাম দিলেও প্রোগ্রাম চলে। অর্থপূর্ণ নাম দিলে বুঝতে সুবিধা হয়, ভেরিয়েবলটা কী উদ্দেশ্যে ব্যবহার করা হয়েছে।<br>\n" +
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
