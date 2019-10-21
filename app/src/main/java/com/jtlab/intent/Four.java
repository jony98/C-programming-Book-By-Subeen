package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় চার");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView = (HtmlTextView) findViewById(R.id.html_text);
        htmlTextView.setHtml("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +

                        "</head>\n" +
                        "    <body>\n" +
                        "        <div class=\"post hentry\">\n" +
                        "<a name=\"4410774181001846778\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় চার] লুপ (Loop)।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-4410774181001846778\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তোমরা এরই মধ্যে প্রোগ্রামের মধ্যে বিভিন্ন ধরনের শর্ত (condition) ব্যবহার করতে শিখে গেছ। এইসব শর্ত দিয়ে বিভিন্ন প্রোগ্রাম তৈরি করাও হয়তো শুরু করে দিয়েছ। খুব ভালো কথা। কিন্তু এখন আমরা আরেকটি সমস্যা ও তার সমাধানের পথ খুঁজব।  একটি প্রোগ্রাম লিখতে হবে, যেটি 1 থেকে 10 পর্যন্ত সব পূর্ণসংখ্যা মনিটরে দেখাবে (প্রতি লাইনে একটি সংখ্যা থাকবে)। খুবই সহজ সমস্যা এবং সমাধানও অত্যন্ত সহজ। আমি জানি, তোমরা এক মিনিটের মধ্যেই নিচের প্রোগ্রামটি লিখে ফেলবে:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     printf(\"1\\n\");  \n" +
                        "     printf(\"2\\n\");  \n" +
                        "     printf(\"3\\n\");  \n" +
                        "     printf(\"4\\n\");  \n" +
                        "     printf(\"5\\n\");  \n" +
                        "     printf(\"6\\n\");  \n" +
                        "     printf(\"7\\n\");  \n" +
                        "     printf(\"8\\n\");  \n" +
                        "     printf(\"9\\n\");  \n" +
                        "     printf(\"10\\n\");  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.১  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখানে আমরা 1 থেকে 10 পর্যন্ত সবগুলো সংখ্যা প্রিন্ট করে দিয়েছি। অবশ্য একটি printf() ব্যবহার করেও কাজটি করা যেত: printf(\"1\\n2\\n3\\n4\\n5\\n6\\n7\\n8\\n9\\n10\\n\");</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আবার প্রোগ্রামটি এভাবেও লেখা যেত। n একটি ইন্টিজার ভেরিয়েবল, যার মান আমরা প্রথমে 1 বসাব। তারপর n-এর মান প্রিন্ট করব। তারপর n-এর মান এক বাড়াব (n = n + 1 অথবা সংক্ষেপে, n++ লিখে)।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "int n = 1;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "printf(\"%d\\n\", n);</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "n = n + 1;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "printf(\"%d\\n\", n);</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "n = n + 1;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "printf(\"%d\\n\", n);</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "n = n + 1;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "/* এভাবে মোট দশ বার */</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আবার nএর মান 1 বাড়ানোর কাজটি কিন্তু এক লাইনেই সেরে ফেলা যায়।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "printf(\"%d\\n\", n);</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "n = n + 1;</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এর পরিবর্তে আমরা লিখতে পারি:</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "printf(\"%d\\n\", n++);</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "যা-ই হোক, এ তো গেল 1 থেকে 10 পর্যন্ত প্রিন্ট করা। কিন্তু আমাদের যদি 1 থেকে 100, বা 1000, বা 10000 পর্যন্ত প্রিন্ট করতে বলা হতো তাহলে আমরা কী করতাম? ওপরে যে পদ্ধতি অবলম্বন করা হয়েছে সেটি তো অবশ্যই করা যেত। কিন্তু আমি জানি, তোমরা কেউই এত কষ্ট করতে রাজি না। </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এ সমস্যা সমাধানের জন্য সব প্রোগ্রামিং ল্যাঙ্গুয়েজেই লুপ (loop) বলে একটি পদ্ধতি রয়েছে। এটি দিয়ে একই কাজ বারবার করা যায়। লুপের মধ্যে একটি শর্ত বসিয়ে দিতে হয়, যেটি পূরণ না হওয়া পর্যন্ত প্রোগ্রামটি লুপের ভেতরের কাজ বারবার করতে থাকবে। সি ল্যাঙ্গুয়েজে দুটি জনপ্রিয় লুপ হচ্ছে while এবং for। আমরা এখন while ব্যবহার করে ওই প্রোগ্রামটি লিখব।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n = 1;  \n" +
                        "     while(n &lt;= 10) {  \n" +
                        "         printf(\"%d\\n\", n);  \n" +
                        "         n++;  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.২  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "কী চমৎকার! এখন আমরা চাইলে 10-এর বদলে যত খুশি বসাতে পারি, যত বসাব 1 থেকে তত পর্যন্ত প্রিন্ট হবে। while লুপে প্রথম বন্ধনীর ভেতর শর্ত লিখে দিতে হয়। প্রোগ্রাম সেই শর্ত পরীক্ষা করে। যতক্ষণ পর্যন্ত শর্তটি সত্য হয় ততক্ষণ পর্যন্ত লুপের ভেতরের কাজগুলো চলতে থাকে। লুপের ভেতরের কাজগুলো থাকবে দ্বিতীয় বন্ধনীর ভেতর। যেমন এখানে লুপের ভেতরে আমরা দুটি কাজ করেছি। n-এর মান প্রিন্ট করেছি আর তারপর n-এর মান 1 বাড়িয়েছি। n-এর মান 1 করে বাড়তে থাকলে একসময় এটি 11 হবে আর তখন n &lt;= 10 এই শর্তটি মিথ্যা হয়ে যাবে (কারণ 11 &gt; 10)। আর প্রোগ্রামটিও লুপ থেকে বের হয়ে আসবে। অর্থাৎ, শর্তটি যখনই মিথ্যা হবে তখনই লুপ থেকে বের হয়ে যাবে।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "ইন্ডেন্টেশনের ব্যাপারটিও খেয়াল করো। লুপের ভেতরের অংশের কোড চার ঘর ডানদিক থেকে শুরু হয়েছে।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এবারে তোমাদের জন্য একটি প্রশ্ন। বলো তো নিচের প্রোগ্রামটির আউটপুট কী হবে?</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n = 1;  \n" +
                        "     while(n &lt;= 10) {  \n" +
                        "         printf(\"%d\\n\", n);  \n" +
                        "     }  \n" +
                        "     n++;  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৩  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এটাও কি 1 থেকে 10 পর্যন্ত সব সংখ্যা প্রিন্ট করবে? দেখা যাক। প্রোগ্রামটি রান করাও। আউটপুট কী?</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "মনিটরে প্রতি লাইনে 1 প্রিন্ট হচ্ছে এবং প্রোগ্রামটি বন্ধ হচ্ছে না। খুবই দুঃখের বিষয়। দেখা যাক দুঃখের পেছনে কারণটা কী। </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "int n = 1; প্রথমে প্রোগ্রামটি n-এর মান 1 বসাবে। </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তারপর while লুপে গিয়ে শর্ত পরীক্ষা করবে। আমরা শর্ত দিয়েছি n &lt;= 10 মানে n-এর মান 10-এর ছোট বা সমান। এই শর্ত তো সত্য কারণ n-এর মান 1। তারপর প্রোগ্রামটি n-এর মান প্রিন্ট করবে printf(\"%d\\n\", n);। তারপর কি n-এর মান 1 বাড়বে? বাড়বে না, কারণ আমরা দ্বিতীয় বন্ধনী শেষ করে দিয়েছি '}' চিহ্ন দিয়ে (মানে লুপ শেষ)। তার মানে প্রোগ্রামটি আবার শর্ত পরীক্ষা করবে, আবার n-এর মান প্রিন্ট করবে...এভাবে চলতেই থাকবে কারণ n-এর মান যেহেতু বাড়ছে না, n &lt;= 10 শর্তটি সব সময় সত্যই রয়ে যাচ্ছে – কখনো মিথ্যা হচ্ছে না।  এখন তোমরা while লুপ নিয়ে বিভিন্ন ধরনের গবেষণা চালিয়ে যেতে পারো। সব সময় সত্য হয় এমন শর্ত ব্যবহার করে তোমার কম্পিউটারকে ব্যস্ত রাখতে পারো। while(1){...} এখানে শর্ত হিসেবে 1 ব্যবহার করা হয়েছে। কম্পিউটার 1 বলতে বোঝে সত্য। সুতরাং লুপের ভেতরের কাজগুলো সব সময় চলতে থাকবে, বন্ধ হবে না। while(1 == 1){...} ও একই আচরণ করবে।  তবে এখন আমি তোমাদের একটি দরকারি জিনিস বলে রাখি, যেটি দিয়ে তোমরা জোর করে লুপ থেকে বের হয়ে যেতে পারবে। সেটি হচ্ছে break স্টেটমেন্ট। কথা না বাড়িয়ে একটি প্রোগ্রাম লিখলেই ব্যাপারটি পরিষ্কার হয়ে যাবে। </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n = 1;  \n" +
                        "     while(n &lt;= 100) {  \n" +
                        "         printf(\"%d\\n\", n);      \n" +
                        "         n++;  \n" +
                        "         if(n &gt; 10) {  \n" +
                        "             break;  \n" +
                        "         }  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৪  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এই প্রোগ্রামটি কী করবে? 1 থেকে 10 পর্যন্ত প্রিন্ট করবে। যদিও while-এর ভেতর আমরা বলেছি যে শর্ত হচ্ছে n &lt;= 100, কিন্তু লুপের ভেতরে আবার বলে দিয়েছি যে যদি n &gt; 10 হয়, তবে break; মানে বের হয়ে যাও, বা লুপটি ভেঙে দাও। break সব সময় যেই লুপের ভেতর থাকে সেটির বাইরে প্রোগ্রামটিকে নিয়ে আসে। সুতরাং n-এর মান 10 প্রিন্ট হওয়ার পরে এর মান এক বাড়বে (n++;) অর্থাৎ n-এর মান হবে 11। আর তখন n &gt; 10 সত্য হবে, ফলে প্রোগ্রামটি if কন্ডিশনের ভেতরে ঢুকে যাবে। সেখানে গিয়ে সে দেখবে তাকে break করতে বলা হয়েছে তাই সে লুপের বাইরে চলে যাবে। break-এর উল্টা কাজ করে, এমন একটি স্টেটমেন্ট হচ্ছে continue;। কোনো জায়গায় continue ব্যবহার করলে লুপের ভেতরে continue-এর পরের অংশের কাজ আর হয় না। নিচের প্রোগ্রামটি কোড করে কম্পাইল ও রান করো:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int n = 0;  \n" +
                        "     while (n &lt; 10) {  \n" +
                        "         n = n + 1;  \n" +
                        "         if (n % 2 == 0) {  \n" +
                        "             continue;  \n" +
                        "         }  \n" +
                        "         printf(\"%d\\n\", n);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৫  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এই প্রোগ্রামটি 1 থেকে 10-এর মধ্যে কেবল বেজোড় সংখ্যাগুলো প্রিন্ট করবে। জোড় সংখ্যার বেলায় continue ব্যবহার করার কারণে প্রোগ্রামটি printf(\"%d\\n\", n); স্টেটমেন্ট এক্সিকিউট না করে লুপের পরবর্তী ধাপের কাজ শুরু করবে।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এবারে আমরা আরেকটি প্রোগ্রাম লিখব। ছোটবেলায় যে নামতাগুলো তোমরা শিখেছ সেগুলো এখন আমরা প্রোগ্রাম লিখে কম্পিউটারের মনিটরে দেখব। চলো 5-এর নামতা দিয়ে শুরু করা যাক। আমাদের প্রোগ্রামের আউটপুট হবে এরকম:</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 1 = 5</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 2 = 10</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 3 = 15</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 4 = 20</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 5 = 25</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 6 = 30</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 7 = 35</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 8 = 40</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 9 = 45</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "5 X 10 = 50</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তোমরা নিশ্চয়ই এখন অনেকগুলো printf ফাংশন লেখা শুরু করবে না। লুপের সাহায্যে প্রোগ্রামটি লিখে ফেলবে:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n = 5;  \n" +
                        "     int i = 1;  \n" +
                        "     while (i &lt;= 10) {  \n" +
                        "         printf(\"%d X %d = %d\\n\", n, i, n*i);  \n" +
                        "         i = i + 1;  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৬  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এতক্ষণ আমরা while লুপ ব্যবহার করলাম। এবার চলো for লুপ ব্যবহার করতে শিখি। 5-এর নামতার প্রোগ্রামটি যদি আমরা for লুপ ব্যবহার করে লিখি তাহলে সেটির চেহারা দাঁড়াবে:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n = 5;  \n" +
                        "     int i;  \n" +
                        "     for(i = 1; i &lt;= 10; i = i + 1) {  \n" +
                        "         printf(\"%d X %d = %d\\n\", n, i, n*i);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৭  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "for লুপের প্রথম বন্ধনীর ভেতর তিনটি অংশ লক্ষ করো। প্রতিটি অংশ সেমিকোলন (;) দিয়ে আলাদা করা হয়েছে। প্রোগ্রামটি যখন লুপের ভেতর ঢুকে তখন প্রথম সেমিকোলনের আগে আমরা যে কাজগুলো করতে বলব, সেগুলো একবার করবে। যেমন এখানে i-এর মান 1 বসাবে। তারপর দ্বিতীয় অংশের কাজ করবে। দ্বিতীয় অংশে সাধারণত শর্ত ব্যবহার করা হয় (while লুপে প্রথম বন্ধনীর ভেতর আমরা যে কাজটি করি আরকি)। ওপরের প্রোগ্রামে আমরা দ্বিতীয় অংশে i &lt;= 10 শর্তটি ব্যবহার করেছি। এই শর্ত যদি মিথ্যা হয় তবে প্রোগ্রামটি লুপ থেকে বেরিয়ে আসবে। আর যদি সত্য হয় তবে লুপের ভেতরের কাজগুলো করবে এবং তার পর for লুপের সেই প্রথম বন্ধনীর ভেতর তৃতীয় অংশে যে কাজগুলো করতে বলা হয়েছে সেগুলো করবে। তারপর আবার দ্বিতীয় অংশে এসে শর্ত পরীক্ষা করবে। প্রথম অংশের কাজ কিন্তু আর হবে না। তো আমাদের প্রোগ্রামটি আবার লক্ষ করো। i &lt;= 10 সত্য, কারণ i-এর মান 1। তারপর printf() ফাংশনের কাজ হবে। তারপর i = i + 1 স্টেটমেন্ট এক্সিকিউট হবে (i-এর মান এক বেড়ে যাবে)। তারপর আবার i &lt;= 10 সত্য না মিথ্যা সেটি পরীক্ষা করা হবে (i-এর মান এখন 2)। তারপর আবার লুপের ভেতরের কাজ হবে (printf())। এভাবে যতক্ষণ না i &lt;= 10 শর্তটি মিথ্যা হচ্ছে ততক্ষণ লুপের ভেতরের কাজ চলতে থাকবে। i-এর মান এক এক করে বেড়ে বেড়ে যখন 11 হবে তখন শর্তটি মিথ্যা হবে আর প্রোগ্রামটি লুপ থেকে বের হয়ে আসবে।  for লুপের প্রথম বন্ধনীর ভেতরের তিনটি অংশই যে ব্যবহার করতে হবে এমন কোন কথা নেই। কোন অংশ ব্যবহার করতে না চাইলে আমরা সেটি ফাঁকা রেখে দিতে পারি, তবে সেমিকোলন কিন্তু অবশ্যই দিতে হবে। যেমন আমরা যদি i-এর মান আগেই নির্ধারণ করে দেই তবে সেটি লুপের ভেতর না করলেও চলে। </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\">   int i = 1;  \n" +
                        "\n" +
                        "   for(; i&lt;= 10; i = i + 1) {  \n" +
                        "       printf(\"%d X %d = %d\\n\", n, i, n*i);  \n" +
                        "   }  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "যদি তিনটি অংশের কোনোটিই লিখতে না চাই, তবে পুরো প্রোগ্রামটি এভাবে লেখা যায়:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n = 5;  \n" +
                        "     int i = 1;  \n" +
                        "     for( ; ; ) {  \n" +
                        "         printf(\"%d X %d = %d\\n\", n, i, n*i);  \n" +
                        "         i = i + 1;  \n" +
                        "         if (i &gt; 10) {  \n" +
                        "             break;  \n" +
                        "         }  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৮  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন আমরা আরেকটি কাজ করব। for লুপ ব্যবহার করে 5-এর নামতায় যে গুণ করেছি (n*i) সেটি না করে কেবল যোগ করে প্রোগ্রামটি লিখব। তোমরা কি অবাক হচ্ছ যে নামতার প্রোগ্রাম আবার গুণ ছাড়া কীভাবে হবে? আমরা কিন্তু 5 x 3-কে লিখতে পারি 5 + 5 + 5। আমি কী করতে যাচ্ছি তা বুঝতে পারছ নিশ্চয়ই। প্রোগ্রামটি লিখে ফেলি:</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int m, n = 5;  \n" +
                        "     int i;  \n" +
                        "     m = 0;  \n" +
                        "     for(i = 1; i &lt;= 10; i = i + 1) {  \n" +
                        "         m = m + n;  \n" +
                        "         printf(\"%d X %d = %d\\n\", n, i, m);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.৯  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "প্রোগ্রামটিতে আমরা গুণ না করে যোগ করলাম। কম্পাইল ও রান করে দেখো। কাজ করবে ঠিকঠাক। কোনো সংখ্যার গুণিতকগুলো যেমন গুণ করে বের করা যায়, তেমনই যোগ করেও করা যায়। আমরা যদি কোনো প্রোগ্রামে দেখি যে গুণ না করে যোগ করলেই কাজ হচ্ছে, তাহলে যোগ করাই ভালো কারণ কম্পিউটারের প্রসেসর একটি যোগ করতে যে সময় নেয়, একটি গুণ করতে তার চেয়ে অনেক বেশি সময় নেয়। যদিও তুমি হয়তো প্রোগ্রাম রান করার সময় তা বুঝতে পারো না। কম্পিউটারের প্রসেসর সম্পর্কে বিস্তারিত লেখাপড়া করলে বিষয়টা জানতে পারবে। আপাতত এটি জানলেই চলবে যে একটি গুণ করার চেয়ে একটি যোগ করা ভালো, কারণ যোগ করতে কম্পিউটার অপেক্ষাকৃত কম সময় নেয়।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "তো আমরা for লুপ শিখে ফেললাম। এখন আমরা চেষ্টা করব শুধু নির্দিষ্ট একটি সংখ্যার নামতা না লিখে 1 থেকে 20 পর্যন্ত সবগুলো সংখ্যার নামতা একবারে লিখে ফেলতে। অর্থাৎ n-এর মান 5 নির্দিষ্ট না করে 1 থেকে 20 পর্যন্ত হবে। এটি করার একটি বোকা পদ্ধতি (নাকি চোরা পদ্ধতি?) হচ্ছে নামতা লিখার অংশটি বারবার কপি-পেস্ট করা। কিন্তু আমরা এটি করব লুপের ভেতর লুপ ব্যবহার করে। একটি লুপের সাহায্যে n-এর মান 1 থেকে 20 পর্যন্ত এক করে বাড়াব। আর তার ভেতর n-এর একটি নির্দিষ্ট মানের জন্য নামতাটা লিখব।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int n, i;  \n" +
                        "     for(n = 1; n &lt;= 20; n = n + 1) {  \n" +
                        "         for(i = 1; i &lt;= 10; i = i + 1) {  \n" +
                        "             printf(\"%d X %d = %d\\n\", n, i, n*i);  \n" +
                        "         }      \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.১০  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন তোমরা প্রোগ্রামটি চালাও। তারপর তোমাদের কাজ হবে গুণ না করে কেবল যোগ ব্যবহার করে প্রোগ্রামটি লেখা।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "আমরা এখানে একটি for লুপের ভেতর আরেকটি for লুপ, যাকে নেস্টেড লুপও (nested loop) বলে, সেটি ব্যবহার করলাম। তো আমরা চাইলে for লুপের ভেতর for বা while অথবা while লুপের ভেতর for বা while লুপ একাধিকবার ব্যবহার করতে পারি। অবশ্য সেটি কখনোই চার বা পাঁচবারের বেশি দরকার হওয়ার কথা না। নেস্টেড লুপ দিয়ে আমরা এখন আরেকটি প্রোগ্রাম লিখব। 1, 2, 3 – এই তিনটি সংখ্যার সব বিন্যাস (permutation) বের করার প্রোগ্রাম। বিন্যাসগুলো ছোট থেকে বড় ক্রমে দেখাতে হবে অর্থাৎ প্রোগ্রামটির আউটপুট হবে এই রকম:</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 2, 3</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 3, 2</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 1, 3</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 3, 1</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 1, 2</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 2, 1</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এই প্রোগ্রামটি অনেকভাবে লেখা যেতে পারে, কিন্তু আমরা এখন পর্যন্ত যতটুকু প্রোগ্রামিং শিখেছি, তাতে নেস্টেড লুপের ব্যবহারই সবচেয়ে ভালো সমাধান।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখানে আমরা প্রথম সংখ্যাটির জন্য একটি লুপ, দ্বিতীয় সংখ্যাটির জন্য প্রথম লুপের ভেতরে একটি লুপ এবং তৃতীয় সংখ্যাটির জন্য দ্বিতীয় লুপের ভেতর আরেকটি লুপ ব্যবহার করব।</div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int a, b, c;   \n" +
                        "     for (a = 1; a &lt;= 3; a++) {   \n" +
                        "         for (b = 1; b &lt;= 3; b++) {   \n" +
                        "             for (c = 1; c &lt;= 3; c++) {   \n" +
                        "                 printf (\"%d, %d, %d\\n\", a, b, c);   \n" +
                        "             }   \n" +
                        "         }   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }   \n" +
                        " প্রোগ্রাম: ৪.১১  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখন প্রোগ্রামটি রান করলে আমরা এই রকম আউটপুট পাব:</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 1, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 1, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 1, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 2, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 2, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 2, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 3, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 3, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 3, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 1, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 1, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 1, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 2, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 2, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 2, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 3, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 3, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 3, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 1, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 1, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 1, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 2, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 2, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 2, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 3, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 3, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 3, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "কিন্তু আমরা তো আসলে এই রকম জিনিস চাচ্ছি না। a-এর মান যখন 1 তখন b ও c-এর মান 1 হবে না, আবার b এবং c-এর মানও সমান হবে না। মানে a, b ও c আলাদা হবে। তাহলে আমরা লুপের ভেতর শর্তগুলো একটু পরিবর্তন করব। দ্বিতীয় লুপের শর্ত b &lt;= 3-এর সঙ্গে আরেকটি শর্ত জুড়ে দেব, b != a।  b &lt;= 3 &amp;&amp; b != a মানে b-এর মান 3-এর চেয়ে ছোট বা সমান হবে এবং b-এর মান a-এর মানের সমান হবে না। তৃতীয় লুপে আমরা এখন শর্ত দেব,  c &lt;= 3 &amp;&amp; c != a &amp;&amp; c != b, মানে c-এর মান 3-এর ছোট বা সমান হতে হবে এবং  c-এর মান a-এর মানের সমান হওয়া চলবে না এবং c-এর মান b-এর মানের সমান হলেও চলবে না। তাহলে আমাদের প্রোগ্রামটির চেহারা দাঁড়াবে এই রকম: </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int a, b, c;   \n" +
                        "     for (a = 1; a &lt;= 3; a++) {   \n" +
                        "         for (b = 1; b &lt;= 3 &amp;&amp; b != a; b++) {   \n" +
                        "             for (c = 1; c &lt;= 3 &amp;&amp; c != a &amp;&amp; c != b; c++) {   \n" +
                        "                 printf (\"%d, %d, %d\\n\", a, b, c);   \n" +
                        "             }   \n" +
                        "         }   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }   \n" +
                        " প্রোগ্রাম: ৪.১২  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "রান করলে আমরা আউটপুট কী দেখব?</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 2, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "মাত্র একটি লাইন! আমরা প্রোগ্রামটি ঠিক করতে গিয়ে ঝামেলা পাকিয়ে ফেলেছি মনে হচ্ছে। তোমরা কি একটু চিন্তা করে ঝামেলার কারণ বের করতে পারবে?</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "<br></div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "প্রথমে a-এর মান 1তাই a &lt;= 3 সত্য। প্রোগ্রামটি প্রথম লুপের ভেতর ঢুকে গেল। তারপর দ্বিতীয় লুপের শুরুতে b-এর মান 1। b &lt;= 3 সত্য। কিন্তু b != a মিথ্যা। কারণ aও b-এর মান তো সমান, দুটোর মানই 1। তাই প্রোগ্রামটি আর দ্বিতীয় লুপের ভেতর ঢুকবে না। এরপর a-এর মান 1 বাড়ল (a++)। a &lt;= 3 সত্য (a-এর মান 2)। এখন দ্বিতীয় লুপ শুরু হবে। b-এর মান 1। এবারে b &lt;= 3 এবং b != a দুটি শর্তই সত্য। প্রোগ্রামটি দ্বিতীয় লুপের ভেতর ঢুকে যাবে। তৃতীয় লুপের শুরুতে c-এর মান 1। c &lt;=3 সত্য, c !=a সত্য কিন্তু c !=b মিথ্যা (দুটোর মানই 1)।  তাই প্রোগ্রামটি তৃতীয় লুপ থেকে বের হয়ে যাবে– কেবল তিনটি শর্ত সত্য হলেই প্রোগ্রামটি তৃতীয় লুপের ভেতর ঢুকবে এবং a, b ও c-এর মান প্রিন্ট করবে। এভাবে কিছুক্ষণ গবেষণা করলে তোমরা দেখবে যে যখন a-এর মান 3, b-এর মান 2 এবং c-এর মান 1, তখনই কেবল সব শর্ত সত্য হয় আর আমরা আউটপুট পাই: 3, 2, 1।  আসলে দ্বিতীয় লুপে আমরা b-এর মান a-এর মানের সমান হলে লুপ থেকে বের হয়ে যাচ্ছি। সেই কাজটি করা ঠিক হচ্ছে না। আমাদের উচিত দুটো মান সমান হলে পরবর্তী মানের জন্য চেষ্টা করা। আর মান দুটো সমান না হলেই কেবল পরবর্তী কাজ করা। তাহলে আমরা লিখতে পারি:  for (b = 1; b &lt;= 3; b++) {     if (b != a) { /* b-এর মান a-এর মানের সমান না হলেই ভেতরের অংশে প্রোগ্রামটি ঢুকবে। */         for (c = 1; c &lt;= 3; c++) {             if (c != a &amp;&amp; c != b) { /*c-এর মান a-এর মানের সমান না হলে এবং c-এর মান b-এর মানের সমান না হলেই কেবল ভেতরের অংশে প্রোগ্রামটি ঢুকবে। */                 printf (\"%d, %d, %d\\n\", a, b, c);              }         }     } }  তাহলে আমাদের পুরো প্রোগ্রামটি দাঁড়াচ্ছে এই রকম: </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main() \n" +
                        " {   \n" +
                        "     int a, b, c;   \n" +
                        "     for (a = 1; a &lt;= 3; a++) {   \n" +
                        "         for (b = 1; b &lt;= 3; b++) {   \n" +
                        "             if (b != a) {                            \n" +
                        "                 for (c = 1; c &lt;= 3; c++) {   \n" +
                        "                     if (c != b &amp;&amp; c != a){                 \n" +
                        "                         printf (\"%d, %d, %d\\n\", a, b, c);   \n" +
                        "                     }   \n" +
                        "                 }   \n" +
                        "             }   \n" +
                        "         }   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }   \n" +
                        " প্রোগ্রাম: ৪.১৩  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "প্রোগ্রামটি চালালে আমরা নিচের আউটপুট দেখব, যেটি আমরা চাচ্ছিলাম।</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 2, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "1, 3, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 1, 3 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "2, 3, 1 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 1, 2 </div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "3, 2, 1</div>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "যাক, অবশেষে আমাদের সমস্যার সমাধান হলো। তবে আমরা কিন্তু আরও সহজেই সমাধান করতে পারতাম এভাবে–  </div>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int a, b, c;   \n" +
                        "     for (a = 1; a &lt;= 3; a++) {   \n" +
                        "         for (b = 1; b &lt;= 3; b++) {   \n" +
                        "             for (c = 1; c &lt;= 3; c++) {   \n" +
                        "                 if(b != a &amp;&amp; c != a &amp;&amp; c != b) {  \n" +
                        "                     printf (\"%d, %d, %d\\n\", a, b, c);   \n" +
                        "                 }  \n" +
                        "             }   \n" +
                        "         }   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৪.১৪  \n" +
                        "</code></pre>\n" +
                        "<div style=\"text-align: justify;\">\n" +
                        "এখানে আমাদের বেশি চিন্তা করতে হলো না। কেবল প্রিন্ট করার সময় a, b, c তিনটির মান পরস্পরের সমান নয়, সেটি নিশ্চিত করে নিলেই হলো! বুদ্ধিটা ভালোই, তবে এটির চেয়ে আমাদের আগের প্রোগ্রামটি কম্পিউটারকে দিয়ে কম কাজ করায়, তাই চলতেও কম সময় লাগে, বা কম্পিউটারের ভাষায় বললে রান টাইম (run time) কম। আসলে একটি প্রোগ্রাম চলতে কেমন সময় লাগবে সেটি নির্ভর করে মূলত প্রোগ্রামটি মোট কয়টি অ্যাসাইনমেন্ট অপারেশন (assignment operation) আর কয়টি কম্পারিজন অপারেশন (comparison operation) করল তার ওপর।<br>\n" +
                        "<br>\n" +
                        "<br>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "<div style=\"clear: both;\"></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "    </body>\n" +
                        "</html>\n",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
