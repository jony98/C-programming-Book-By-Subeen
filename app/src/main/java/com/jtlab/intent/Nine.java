package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Nine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় নয়");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView =  findViewById(R.id.html_text);
        htmlTextView.setHtml("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <div class=\"post hentry\">\n" +
                        "<a name=\"4127490210443698462\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় নয়] স্ট্রিং (string)।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-4127490210443698462\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\"><div style=\"text-align: justify;\">তোমরা যারা string শব্দটির বাংলা অর্থ জানো, তাদের আতঙ্কিত হওয়ার কোনো কারণ নেই, প্রোগ্রামিংয়ে স্ট্রিং মোটেও দড়ি টানাটানির মতো কষ্টকর ব্যাপার নয়। আবার তোমাদের মধ্যে যারা একটু জ্ঞানী টাইপের তাদের মাথায় হয়তো স্ট্রিং থিওরী শব্দটি চলে এসেছে। যা-ই হোক, উদ্বেগের কোনো কারণ নেই।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এক বা একাধিক character মিলে string তৈরি হয়। সোজা কথায় স্ট্রিং হচ্ছে ক্যারেক্টার টাইপের অ্যারে। তবে প্রোগ্রামিংয়ে এটির ব্যবহার এতই বেশি যে কোনো কোনো ল্যাঙ্গুয়েজে স্ট্রিংকে আলাদা একটি ডাটা টাইপ হিসেবে ধরা হয়। তবে সি-তে আমরা char টাইপের অ্যারে দিয়েই স্ট্রিংয়ের কাজ করব।</div><br>\n" +
                        "নিচের উদাহরণগুলো লক্ষ করো:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> char country[11] = {'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h', '\\0'};    \n" +
                        " char country[] = {'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h', '\\0'};    \n" +
                        " char country[] = \"Bangladesh\";    \n" +
                        " char *country = \"Bangladesh\";    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এভাবে আমরা স্ট্রিং ডিক্লেয়ার করতে পারি। চারটি ডিক্লারেশন আসলে একই জিনিস। সবার শেষে একটি Null character ('\\0') দিলে কম্পাইলার বুঝতে পারে এখানেই স্ট্রিংয়ের শেষ। আবার তৃতীয় উদাহরণে অ্যারের উপাদানগুলো আলাদা করে লেখা হয়নি, একসঙ্গে লেখা হয়েছে। এ ক্ষেত্রে কম্পাইলার নিজেই Null character বসিয়ে নেবে। চতুর্থ উদাহরণটি একটু অদ্ভুত। এখানে যে জিনিসটা ব্যবহার করা হয়েছে তার নাম পয়েন্টার (pointer)। এ বইতে এরকম জিনিস আমরা মাঝে মাঝে ব্যবহার করলেও বিস্তারিত আলোচনায় যাব না। </div><br>\n" +
                        "এবারে প্রোগ্রাম লিখার পালা।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char country[] = {'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h', '\\0'};     \n" +
                        "     printf(\"%s\\n\", country);     \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.১    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এখানে লক্ষ করো যে printf-এর ভেতরে %s ব্যবহার করা হয়েছে স্ট্রিং প্রিন্ট করার জন্য। আর অ্যারেতে শেষের '\\0'টা ব্যবহার না করলেও চলে আসলে। বর্তমানের কম্পাইলারগুলো এটি বুঝে নিতে পারে।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char country[] = {'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h', ' ', 'i', 's', ' ', 'm', 'y', ' ', 'c', 'o', 'u', 'n', 't', 'r', 'y'};     \n" +
                        "     printf(\"%s\\n\", country);     \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.২    \n" +
                        "</code></pre><br>\n" +
                        "প্রোগ্রামটি চালাও। তারপর নিচের প্রোগ্রামটি চালাও। আউটপুটে কি পার্থক্য দেখতে পাচ্ছ? পার্থক্যের কারণটা কী?<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char country[] = {'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h', '\\0', 'i', 's', ' ', 'm', 'y', ' ', 'c', 'o', 'u', 'n', 't', 'r', 'y'};     \n" +
                        "     printf(\"%s\\n\", country);        \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.৩    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">পার্থক্যটা কী সেটি তোমরা প্রোগ্রাম দুটি কম্পিউটারে চালালেই বুঝবে। পার্থক্যের কারণ হচ্ছে দ্বিতীয় প্রোগ্রামে স্ট্রিংয়ের ভেতরে এক জায়গায় '\\0' থাকায় কম্পাইলার ধরে নিচ্ছে ওখানে স্ট্রিংটা শেষ হয়ে গেছে।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এবারে আমরা একটি প্রোগ্রাম লিখব। একটি স্ট্রিংয়ের ভেতরের সব অক্ষরকে বড় হাতের অক্ষরে (অর্থাৎ capital letter বা uppercase character) রূপান্তর করা। তবে এর জন্য আমাদের একটি জিনিস জানতে হবে। প্রতিটি অক্ষরের বিপরীতে কম্পিউটার একটি সংখ্যার কোড ব্যবহার করে। সেই কোড অনুযায়ী, 'A'-এর মান হচ্ছে 65, 'B'-এর মান হচ্ছে 66, 'C'-এর মান হচ্ছে 67... এভাবে 'Z'-এর মান হচ্ছে 90। তেমনই 'a' হচ্ছে 97, 'b' হচ্ছে 98 ... এভাবে 'z' হচ্ছে 122। সুতরাং কোনো ক্যারেক্টার বড় হাতের কি না সেটি আমরা নির্ণয় করতে পারি এভাবে: if(ch &gt;= 'A' &amp;&amp; ch &lt;= 'Z') অথবা if(ch &gt;= 65 &amp;&amp; ch &lt;= 90)। তেমনই ছোট হাতের অক্ষরের জন্য: if(ch &gt;= 'a' &amp;&amp; ch &lt;= 'z') অথবা if(ch &gt;= 97 &amp;&amp; ch &lt;= 122)। এখন কোনো ক্যারেক্টার যদি ছোট হাতের হয়, তবে তাকে বড় হাতের অক্ষরে রূপান্তর করার উপায় কী? উপায় খুব সহজ। একটি উদাহরণ দেখো: char ch = 'c'; ch = 'A' + (ch – 'a'); এখানে যেটি হচ্ছে, প্রথমে ch থেকে 'a' বিয়োগ করা হচ্ছে মানে 'c' থেকে 'a' বিয়োগ (আসলে 99 থেকে 97 বিয়োগ হচ্ছে)। বিয়োগফল 2। এবারে 'A'-এর সঙ্গে যদি ওই 2 যোগ করে দিই তবে সেটি 'C' হয়ে যাবে!  এখন প্রোগ্রামটি লিখে ফেলা যাক:&nbsp;</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char country[] = {'B', 'a', 'n', 'g', 'l', 'a', 'd', 'e', 's', 'h'};     \n" +
                        "     int i, length;     \n" +
                        "     printf(\"%s\\n\", country);     \n" +
                        "     length = 10;         \n" +
                        "     for(i = 0; i &lt; length; i++) {     \n" +
                        "         if(country[i] &gt;= 97 &amp;&amp; country[i] &lt;= 122) {     \n" +
                        "             country[i] = 'A' + (country[i] - 'a');     \n" +
                        "         }     \n" +
                        "     }     \n" +
                        "     printf(\"%s\\n\", country);     \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.৪    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এখন তোমরা uppercase থেকে lowercase-এ রূপান্তরের প্রোগ্রামটি লিখে ফেলো। তারপরে আবার বইটি পড়া শুরু করো।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এখানে লক্ষ করো যে স্ট্রিংয়ে (ক্যারেক্টারের অ্যারেতে) মোট কয়টি উপাদান আছে সেটি আমি দেখেই লিখে ফেলেছি এবং সরাসরি বসিয়ে দিয়েছি length = 10।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এবার আমরা কোনো স্ট্রিংয়ের দৈর্ঘ্য মাপার জন্য একটি ফাংশন লিখব! এটি তেমন কঠিন কিছু নয়। একটি লুপের সাহায্যে স্ট্রিংয়ের প্রতিটি উপাদান পরীক্ষা করতে হবে এবং Null character ('\\0') পেলে লুপ থেকে বের হয়ে যাবে অর্থাৎ, '\\0' না পাওয়া পর্যন্ত লুপ চলতে থাকবে। আর লুপ যতবার চলবে স্ট্রিংয়ের দৈর্ঘ্যও তত হবে।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int string_length(char str[])     \n" +
                        " {     \n" +
                        "     int i, length = 0;     \n" +
                        "     for(i = 0; str[i] != '\\0'; i++) {     \n" +
                        "         length++;     \n" +
                        "     }     \n" +
                        "     return length;    \n" +
                        " }     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char country[100];     \n" +
                        "     int length;     \n" +
                        "     while(1 == scanf(\"%s\", country)) {                \n" +
                        "         length = string_length(country);     \n" +
                        "         printf(\"length: %d\\n\", length);     \n" +
                        "     }     \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.৫    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">ওপরের প্রোগ্রামটায় তোমরা দেখতে পাচ্ছ যে ইনপুট নেওয়ার জন্য scanf ফাংশন ব্যবহার করা হয়েছে এবং স্ট্রিং ইনপুট নেওয়ার জন্য %s ব্যবহৃত হয়েছে। scanf ফাংশনটি যতটি উপাদান ইনপুট হিসেবে নেয়, সেই সংখ্যাটি রিটার্ন করে। সাধারণত রিটার্ন ভ্যালুটি আমাদের দরকার হয় না, তাই scanf ব্যবহার করলেও আমরা ওই ভ্যালুটি রাখি না। যেমন দুটি ইন্টিজার ইনপুট নিতে গেলে আমরা লিখি: scanf(\"%d %d\", &amp;n1, &amp;n2);। আমরা এটি চাইলে এভাবেও লিখতে পারতাম: value = scanf(\"%d %d\", &amp;n1, &amp;n2);। তোমরা প্রিন্ট করলে দেখবে value-এর মান 2। while(1 == scanf(\"%s\", country)) লাইনে যেটি ঘটছে তা হলো, যতক্ষণ একটি country-এর নাম scanf দিয়ে ইনপুট নেওয়া হচ্ছে, ফাংশনটি 1 রিটার্ন করছে, আর লুপের ভেতরের কন্ডিশন সত্য হচ্ছে (1 == 1), তাই লুপের কাজ চলতে থাকবে।</div><br>\n" +
                        "<div style=\"text-align: justify;\">আরেকটি জিনিস খেয়াল করো যে country-এর আগে কোন &amp; চিহ্ন ব্যবহার করা হয়নি। তোমরা &amp;country লিখে দেখো প্রোগ্রামটি কী আচরণ করে। তবে %s ব্যবহারের একটি সমস্যা হচ্ছে স্ট্রিংয়ে কোনো হোয়াইটস্পেস ক্যারেক্টার (যেমন: স্পেস, ট্যাব ইত্যাদি) থাকা যাবে না, এমন কিছু পেলে scanf ওই ক্যারেক্টার পর্যন্ত একটি স্ট্রিং ধরে নেয়। যেমন, ইনপুট যদি হয় this is তবে scanf প্রথমে thisকেই স্ট্রিং হিসেবে নেবে, তারপরে যদি আবার scanf ফাংশন কল করা হয়, তবে isকে সে স্ট্রিং হিসেবে ইনপুট নিয়ে নেবে। এই সমস্যা এড়ানোর জন্য আমরা gets ফাংশন ব্যবহার করতে পারি। নিচের উদাহরণটি দেখো:</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char ara[100];     \n" +
                        "     while(NULL != gets(ara)) {                     \n" +
                        "         printf(\"%s\\n\", ara);     \n" +
                        "     }     \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.৬    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এই প্রোগ্রামটিও চলতে থাকবে যতক্ষণ না তুমি ctrl + z (মানে কি-বোর্ডে ctrl ও z একসঙ্গে) চাপো, লিনাক্সের জন্য ctrl + d। ctrl + z বা ctrl + d দিলে gets ফাংশনটি NULL রিটার্ন করে। আরেকটি জিনিস লক্ষ করো যে আমি char ara[100]; ডিক্লেয়ার করে শুরুতেই বলে দিয়েছি স্ট্রিংয়ের সর্বোচ্চ দৈর্ঘ্য হবে 100।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আরেকটি ব্যাপার। string_length ফাংশনের ভেতরে আসলে দুটি ভেরিয়েবল ব্যবহার না করলেও চলে। আমরা ফাংশনটি এভাবেও লিখতে পারি:</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> int string_length(char str[])     \n" +
                        " {     \n" +
                        "     int i;         \n" +
                        "     for(i = 0; str[i] != '\\0'; i++);             \n" +
                        "     return i;     \n" +
                        " }     \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এখন তোমাদের কাজ হবে string_length ফাংশনটি for লুপ ব্যবহার না করে while লুপ ব্যবহার করে লেখা।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আমাদের পরবর্তী প্রোগ্রামের লক্ষ্য হবে দুটি স্ট্রিং জোড়া দেওয়া বা concatenate করা। যেমন একটি স্ট্রিং যদি হয় \"bangla\" এবং আরেকটি স্ট্রিং যদি হয় \"desh\" তবে দুটি জোড়া দিয়ে \"bangladesh\" বানাতে হবে।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">প্রথমেই স্ট্রিংগুলো ডিক্লেয়ার করে নেই: char str1[] = \"bangla\", str2[] = \"desh\", str3[12];</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আমাদের লক্ষ হচ্ছে str3তে \"bangladesh\" রাখা। খুব সুবিধা হতো যদি আমরা এমন কিছু লিখতে পারতাম:</div><div style=\"text-align: justify;\">str3 = str1 + str2;</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">কিন্তু 'সি'-তে এভাবে দুটি অ্যারে বা স্ট্রিং যোগ করা যায় না। তাই একটি একটি করে str1-এর উপাদানগুলো str3তে কপি করতে হবে, তারপর str2-এর উপাদানগুলো str3তে কপি করতে হবে।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;     \n" +
                        " int main()     \n" +
                        " {     \n" +
                        "     char str1[] = \"bangla\", str2[] = \"desh\", str3[12];     \n" +
                        "     int i, j, length1 = 6, length2 = 4;     \n" +
                        "     for(i = 0, j = 0; i &lt; length1; i++, j++) {     \n" +
                        "         str3[j] = str1[i];     \n" +
                        "     }         \n" +
                        "     for(i = 0, j = 0; i &lt; length2; i++, j++) {     \n" +
                        "         str3[j] = str2[i];     \n" +
                        "     }     \n" +
                        "     str3[j] = '\\0';     \n" +
                        "     printf(\"%s\\n\", str3);     \n" +
                        "     return 0;     \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.৭    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">প্রোগ্রামটি চালাও। আউটপুট কী আসা উচিত? bangladesh। কিন্তু আউটপুট এসেছে desh। আসলে আমরা কিছু একটা ভুল করেছি। তোমাদের এখন সেই ভুলটি ঠিক করার চেষ্টা করা উচিত। অন্তত তিরিশ মিনিট চেষ্টার পরও যদি ভুল বের করতে না পারো তবে আবার বইটি পড়া শুরু করো।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> for(i = 0, j = 0; i &lt; length1; i++, j++) {     \n" +
                        "     str3[j] = str1[i];     \n" +
                        " }    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এখানে আমরা শুরুতেই i-এর মান 0 করেছি কারণ iকে আমরা str1-এর ইনডেক্স হিসেবে ব্যবহার করব। jকে ব্যবহার করব str3-এর ইনডেক্স হিসেবে তাই j-এর মানও 0 করা হয়েছে। তারপর একে একে str1-এর উপাদানগুলো str3তে কপি করছি এবং i ও j-এর মান 1 করে বাড়াচ্ছি (i++, j++)। লুপ শেষ হওয়ার পরে i ও j প্রত্যেকের মান হবে 6।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এখন পরের লুপে আমরা str2কে str3-তে কপি করব। এখন str2-এর ইনডেক্স হিসেবে যদি i ব্যবহার করি, তবে তার মান লুপের শুরুতেই আবার 0 করে দিতে হবে। আমরা সেটি করেছি। কিন্তু ভুল করেছি সেই সঙ্গে j-এর মান 0 করে দিয়ে। j-এর মান 0 করলে তো str2-এর প্রথম (0তম) উপাদান str3-এর প্রথম (0তম) উপাদান হিসেবে কপি হবে, কিন্তু আমরা তো সেটি চাই না। আমরা চাই str2-এর প্রথম উপাদান হবে str3-এর সপ্তম উপাদান। তাহলে j-এর মান 0 করা যাবে না। তাই দ্বিতীয় লুপটি হবে এমন:</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> for(i = 0; i &lt; length2; i++, j++) {     \n" +
                        "     str3[j] = str2[i];     \n" +
                        " }    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">আরেকটি ব্যাপার লক্ষ করো। দ্বিতীয় লুপ থেকে বের হবার পরে str3-এর শেষ ঘরে '\\0' অ্যাসাইন করেছি (str3[j] = '\\0';) যাতে স্ট্রিংটা যে ওখানেই শেষ, এটি কম্পাইলার বুঝতে পারে।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আমাদের পরবর্তী প্রোগ্রাম হবে দুটি স্ট্রিংয়ের মধ্যে তুলনা করা। অর্থাৎ দুটি স্ট্রিংয়ের মধ্যে ছোট, বড়, সমান নির্ণয় করা। সংখ্যার ক্ষেত্রে যেমন &gt;, &lt;, &gt;=, &lt;=, == চিহ্ন ব্যবহার করে তুলনা করা যায়, স্ট্রিংয়ের ক্ষেত্রে সেই ব্যবস্থা নাই। কিন্তু স্ট্রিংয়ের ক্ষেত্রে প্রায়ই আমাদের এই তুলনা করার দরকার পড়বে। যেমন ধরো, সর্টিংয়ের ক্ষেত্রে যেখানে ছোট থেকে বড় বা বড় থেকে ছোট ক্রমানুসারে সাজাতে হবে (alphabetical ordering)। স্ট্রিংয়ে ছোট-বড় আবার কী? বেশি কথা বলে ব্যাখ্যা না করে কিছু উদাহরণ দিই, তাহলেই বুঝতে পারবে।  'aaa'-এর চেয়ে 'aab' বড়। আবার 'ba' ও 'ca'-এর মধ্যে 'ca' বড়।  এই প্রোগ্রামে আমরা একটি ফাংশন লিখব string_compare() যেটির কাজ হবে দুটি স্ট্রিংয়ের মধ্যে তুলনা করে প্রথমটি দ্বিতীয়টির চেয়ে বড় হলে 1 রিটার্ন করবে, ছোট হলে -1 আর দুটি সমান হলে 0 রিটার্ন করবে।  ফাংশনের রিটার্ন টাইপ হবে ইন্টিজার এবং প্যারামিটার হবে দুটি char টাইপের অ্যারে।&nbsp;</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> int string_compare(char a[], char b[])    \n" +
                        " {    \n" +
                        "\n" +
                        " }    </code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">আমাদের মূল কাজ হবে a-এর প্রথম উপাদানের সঙ্গে b-এর প্রথম উপাদান, a-এর দ্বিতীয় উপাদানের সঙ্গে b-এর দ্বিতীয় উপাদান এভাবে তুলনা করতে থাকা। যখনই a-এর কোনো উপাদান b-এর কোনো উপাদানের চেয়ে ছোট হবে, আমরা সঙ্গে সঙ্গে বলে দিতে পারি যে a, b-এর চেয়ে ছোট। সুতরাং -1 রিটার্ন করে ফাংশন থেকে বের হয়ে আসব। একইভাবে যখনই a-এর কোনো উপাদান b-এর কোনো উপাদানের চেয়ে বড় হবে, সঙ্গে সঙ্গে 1 রিটার্ন করে ফাংশন থেকে বের হয়ে আসব কারণ a, b-এর চেয়ে বড়। কিন্তু যদি সবগুলোই সমান হয়? তখন আমরা 0 রিটার্ন করব। তাতে বুঝব যে স্ট্রিং দুটি সমান।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> int string_compare(char a[], char b[])     \n" +
                        " {     \n" +
                        "     int i, j;     \n" +
                        "     for(i = 0; a[i] != '\\0' &amp;&amp; b[i] != '\\0'; i++) {     \n" +
                        "         if(a[i] &lt; b[i]) {     \n" +
                        "             return -1;     \n" +
                        "         }     \n" +
                        "         if(a[i] &gt; b[i]) {     \n" +
                        "             return 1;     \n" +
                        "         }     \n" +
                        "     }     \n" +
                        "     if(string_length(a) == string_length(b)) {     \n" +
                        "         return 0;     \n" +
                        "     }     \n" +
                        "     if(string_length(a) &lt; string_length(b)) {     \n" +
                        "         return -1;     \n" +
                        "     }     \n" +
                        "     if(string_length(a) &gt; string_length(b)) {     \n" +
                        "         return 1;     \n" +
                        "     }     \n" +
                        " }     \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">স্ট্রিংয়ের বেসিক জিনিসগুলো নিয়ে আলোচনা করলাম। তবে মজার ব্যাপার হচ্ছে সি ল্যাঙ্গুয়েজে একটি হেডার ফাইল আছে, যার নাম string.h এবং ওইখানে বেশিরভাগ স্ট্রিং-সংক্রান্ত কাজের জন্য ফাংশন তৈরি করে দেওয়া আছে (যেমন: strcmp, strlen, strcpy ইত্যাদি)। তোমাদের দিয়ে কাজগুলো আমি আবার করালাম বলে দুঃখ পাওয়ার কোনো কারণ নেই, আমার ওপর রাগ করারও কিছু নেই। মৌলিক জিনিসগুলো শিখে রাখা সব সময়ই গুরুত্বপূর্ণ, যা তোমার প্রোগ্রামিং চিন্তাকে বিকশিত করবে। </div><br>\n" +
                        "<div style=\"text-align: justify;\">এখন আমরা আরেকটি প্রোগ্রাম লিখব যেটি ইনপুট হিসেবে একটি স্ট্রিং নেবে (যেখানে অনেকগুলো শব্দ থাকবে)। এই স্ট্রিংয়ের সর্বোচ্চ দৈর্ঘ্য হবে 1000। শব্দগুলোর মাঝখানে এক বা একাধিক স্পেস থাকবে। আউটপুট হিসেবে প্রতিটি শব্দ আলাদা লাইনে প্রিন্ট করতে হবে। বিরামচিহ্নগুলো (punctuation) প্রিন্ট করা যাবে না এবং শব্দের প্রথম অক্ষর হবে বড় হাতের। </div><br>\n" +
                        "<div style=\"text-align: justify;\">অনেক শর্ত দিয়ে ফেললাম। তবে প্রোগ্রামটি খুব কঠিন কিছু নয়। নিজে নিজে চেষ্টা করতে পারো। আর না পারলে এখন চলো দেখি কীভাবে সমাধান করা যায়।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">প্রথম কথা হচ্ছে, ইনপুট নেব কীভাবে? বুঝতেই পারছ যে ইনপুটে যেহেতু স্পেস থাকবে, scanf(\"%s\") ব্যবহার করা যাবে না। তাই আমরা gets() ব্যবহার করব। তার পরের কথা হচ্ছে একটি শব্দে কোন কোন ক্যারেক্টার থাকতে পারে? যেহেতু বলা নেই, আমরা ধরে নিই 'a' থেকে 'z', 'A' থেকে 'Z' আর '0' থেকে '9' থাকবে।</div><br>\n" +
                        "<div style=\"text-align: justify;\">তার পরের প্রশ্ন হচ্ছে, আমরা কখন বুঝব বা আমাদের প্রোগ্রামকে কীভাবে বোঝাবো যে একটি শব্দ শুরু হয়েছে?-এর জন্য আমরা একটি ভেরিয়েবল রাখতে পারি। ভেরিয়েবলের নাম যদি দিই is_word_started তাহলে এর মান 0 হলে বুঝব শব্দ শুরু হয়নি, শব্দ শুরু হলে এর মান আমরা 1 করে দেব। আবার শব্দ শেষ হলে 0 করে দেব। যখন দেখব শব্দ শুরু হয়ে গেছে (is_word_started-এর মান 1) কিন্তু কোনো ক্যারেক্টারের মান 'a' – 'z' বা 'A' – 'Z', বা '0' – '9' এই রেঞ্জের মধ্যে নেই, তখনই বুঝব শব্দটি শেষ। তোমরা যদি এর আগে প্রোগ্রামটি চেষ্টা করার পরও লিখতে না পারো, এখন চেষ্টা করলে পারবে আশা করি। আমি এখন কোডটি লিখে দেব তবে সেটি দেখার আগে অবশ্যই নিজে করার চেষ্টা করতে হবে।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;    \n" +
                        " #include &lt;string.h&gt;    \n" +
                        " int main()    \n" +
                        " {    \n" +
                        "     char s[1002], word[100];    \n" +
                        "     int i, j, length, is_word_started;    \n" +
                        "     gets(s);    \n" +
                        "     length = strlen(s);    \n" +
                        "     is_word_started = 0;    \n" +
                        "     for (i = 0, j = 0; i &lt; length; i++) {    \n" +
                        "         if (s[i] &gt;= 'a' &amp;&amp; s[i] &lt;= 'z') {    \n" +
                        "             if (is_word_started == 0) {    \n" +
                        "                 is_word_started = 1;    \n" +
                        "                 word[j] = 'A' + s[i] - 'a'; // first character is capital    \n" +
                        "                 j++;    \n" +
                        "             }    \n" +
                        "             else {    \n" +
                        "                 word[j] = s[i];    \n" +
                        "                 j++;    \n" +
                        "             }    \n" +
                        "         }    \n" +
                        "         else if (s[i] &gt;= 'A' &amp;&amp; s[i] &lt;= 'Z') {    \n" +
                        "             if (is_word_started == 0) {    \n" +
                        "                 is_word_started = 1;    \n" +
                        "             }    \n" +
                        "             word[j] = s[i];    \n" +
                        "             j++;    \n" +
                        "         }    \n" +
                        "         else if (s[i] &gt;= '0' &amp;&amp; s[i] &lt;= '9') {    \n" +
                        "             if (is_word_started == 0) {    \n" +
                        "                 is_word_started = 1;    \n" +
                        "             }    \n" +
                        "             word[j] = s[i];    \n" +
                        "             j++;    \n" +
                        "         }    \n" +
                        "         else {    \n" +
                        "             if (is_word_started == 1) {    \n" +
                        "                 is_word_started = 0;    \n" +
                        "                 word[j] = '\\0';    \n" +
                        "                 printf(\"%s\\n\", word);    \n" +
                        "                 j = 0;    \n" +
                        "             }    \n" +
                        "         }    \n" +
                        "     }    \n" +
                        "     return 0;    \n" +
                        " }     \n" +
                        " প্রোগ্রাম: ৯.৮    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">প্রোগ্রামটি বুঝতে কি একটু সমস্যা হচ্ছে? সে পরে দেখা যাবে, আগে প্রোগ্রামটি চটপট কম্পিউটারে টাইপ করে ফেলো, কম্পাইল ও রান করো। যারা লিনাক্স ব্যবহার করছ তারা gets() ব্যবহারের কারণে কম্পাইলার থেকে একটি সতর্ক সংকেত (warning) পেতে পারো, পাত্তা দিয়ো না।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">ইনপুট হিসেবে যেকোনো কিছু লিখতে পারো। যেমন: This is a test.। আউটপুট কী?</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">আউটপুট হচ্ছে এই রকম:</div><br>\n" +
                        "This<br>\n" +
                        "Is<br>\n" +
                        "A<br>\n" +
                        "<br>\n" +
                        "<div style=\"text-align: justify;\">কী মুশকিল! test গেল কোথায়?</div><div style=\"text-align: justify;\">এখন তোমার কাজ হবে test-এর নিখোঁজ হওয়ার রহস্যটা তদন্ত করা। তারপর আমি প্রোগ্রামটি ব্যাখ্যা করব।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">তোমরা দেখো প্রোগ্রামে আমি স্ট্রিংয়ের দৈর্ঘ্য নির্ণয়ের জন্য strlen ফাংশন ব্যবহার করেছি। আর-এর জন্য আমাকে string.h হেডার ফাইলটি include করতে হয়েছে। ইনপুট হিসেবে স্ট্রিংটা নিলাম s-এ। আর word রাখার জন্য একটি অ্যারে ডিক্লেয়ার করে রেখেছি। তারপর আমি i = 0 থেকে length পর্যন্ত একটি লুপ চালিয়েছি s-এর ভেতরের প্রতিটি ক্যারেক্টার পরীক্ষা করার জন্য।</div><br>\n" +
                        "<div style=\"text-align: justify;\">if (s[i] &gt;= 'a' &amp;&amp; s[i] &lt;= 'z') দিয়ে পরীক্ষা করলাম এটি ছোট হাতের অক্ষর নাকি। যদি ছোট হাতের অক্ষর হয় তবে একটি শব্দের প্রথম অক্ষর কি না সেটি জানতে হবে। কারণ প্রথম অক্ষর হলে ওটাকে আবার বড় হাতের অক্ষরে রূপান্তর করতে হবে। সেই পরীক্ষাটা আমরা করেছি: if (is_word_started == 0) দিয়ে। এটি সত্য হওয়া মানে শব্দ শুরু হয়নি, এটিই প্রথম অক্ষর। তাই আমরা    is_word_started-এর মান 1 করে দেব। আর word[j]তে s[i]-এর বড় হাতের অক্ষরটা নেব। তারপর j-এর মান এক বাড়াতে হবে।  else if (s[i] &gt;= 'A' &amp;&amp; s[i] &lt;= 'Z') এবং else if (s[i] &gt;= '0' &amp;&amp; s[i] &lt;= '9') এই দুটি শর্তের ভেতরেই আমরা একই কাজ করি। s[i]কে word[j]তে কপি করি। তাই চাইলে দুটি শর্তকে একসঙ্গে এভাবেও লিখতে পারতাম:  else if ((s[i] &gt;= 'A' &amp;&amp; s[i] &lt;= 'Z') || (s[i] &gt;= '0' &amp;&amp; s[i] &lt;= '9'))  তার পরের else-এর ভেতরে ঢোকার মানে হচ্ছে আগের if এবং else if-এর শর্তগুলো মিথ্যা হয়েছে। তাই s[i]-এর ভেতরে যেই ক্যারেক্টার আছে সেটি word-এ রাখা যাবে না। এবং যদি word ইতিমধ্যে শুরু হয়ে গিয়ে থাকে, সেটি শেষ করতে হবে এবং wordটি প্রিন্ট করতে হবে। আর যদি word শুরু না হয়ে থাকে তাহলে কিছু করার দরকার নেই।&nbsp;</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> else {    \n" +
                        "     if (is_word_started == 1) {    \n" +
                        "         is_word_started = 0;    \n" +
                        "         word[j] = '\\0';    \n" +
                        "         printf(\"%s\\n\", word);    \n" +
                        "         j = 0;    \n" +
                        "     }    \n" +
                        " }    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">তোমরা কি test-রহস্য সমাধান করতে পেরেছ? তোমরা চেষ্টা করতে থাকো আর আমি এখন প্রোগ্রামটি অন্যভাবে লিখব (এর সঙ্গে test রহস্যের কোনো সম্পর্ক নেই সেটি বলে রাখলাম)।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">এখন আমি যেটি করব, প্রোগ্রামটি এমনভাবে লিখব যাতে word অ্যারেটিই ব্যবহার করতে না হয়! একটু চিন্তা করে দেখো। আসলে তো এই অ্যারেটি নিয়ে আমরা কিছু করছি না প্রিন্ট করা ছাড়া। তাই এর আসলে কোনো দরকার নেই।</div><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;    \n" +
                        " #include &lt;string.h&gt;    \n" +
                        " int main()    \n" +
                        " {    \n" +
                        "     char s[1002], ch;    \n" +
                        "     int i, length, is_word_started;    \n" +
                        "     gets(s);    \n" +
                        "     length = strlen(s);    \n" +
                        "     is_word_started = 0;    \n" +
                        "     for (i = 0; i &lt; length; i++) {    \n" +
                        "         if (s[i] &gt;= 'a' &amp;&amp; s[i] &lt;= 'z') {    \n" +
                        "             if (is_word_started == 0) {    \n" +
                        "                 is_word_started = 1;    \n" +
                        "                 ch = 'A' + s[i] - 'a';    \n" +
                        "                 printf(\"%c\", ch);    \n" +
                        "             }    \n" +
                        "             else {    \n" +
                        "                 printf(\"%c\", s[i]);    \n" +
                        "             }    \n" +
                        "         }    \n" +
                        "         else if ((s[i] &gt;= 'A' &amp;&amp; s[i] &lt;= 'Z') || (s[i] &gt;= '0' &amp;&amp; s[i] &lt;= '9')) {    \n" +
                        "             if (is_word_started == 0) {    \n" +
                        "                 is_word_started = 1;    \n" +
                        "             }    \n" +
                        "             printf(\"%c\", s[i]);    \n" +
                        "         }    \n" +
                        "         else {    \n" +
                        "             if (is_word_started == 1) {    \n" +
                        "                 is_word_started = 0;    \n" +
                        "                 printf(\"\\n\");    \n" +
                        "             }    \n" +
                        "         }    \n" +
                        "     }    \n" +
                        "     printf(\"\\n\");    \n" +
                        "     return 0;    \n" +
                        " }    \n" +
                        " প্রোগ্রাম: ৯.৯    \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\">এখন প্রোগ্রামটি বুঝতে চেষ্টা করো এবং বিভিন্ন ইনপুট দিয়ে পরীক্ষা করে দেখো। যেমন: </div><div style=\"text-align: justify;\">This is test number 9.9</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">স্ট্রিং-সংক্রান্ত সমস্যাগুলো দেখতে জটিল মনে হলেও আসলে সহজ। আর এ ধরনের সমস্যা সমাধানের যত চর্চা করবে দক্ষতা তত বাড়বে।</div></div>\n" +
                        "<div style=\"clear: both;\"></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
