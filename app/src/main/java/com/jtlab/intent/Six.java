package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় ছয়");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView =  findViewById(R.id.html_text);
        htmlTextView.setHtml("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "    <body>\n" +
                        "        <div class=\"post hentry\">\n" +
                        "<a name=\"1818967278561077919\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় ছয়] অ্যারে।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-1818967278561077919\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                        "এতক্ষণে তোমাদের প্রোগ্রামিং জ্ঞান-বুদ্ধি একটু বেড়েছে। চলো, এবার তাহলে কিছু জনসেবামূলক কর্মকাণ্ড করা যাক। আমরা স্কুলের প্রিয় গণিত শিক্ষকের জন্য পরীক্ষার ফলাফল বের করার প্রোগ্রাম লিখে দেব। ওই স্কুলে প্রথম সাময়িক, দ্বিতীয় সাময়িক ও বার্ষিক এই তিনটি পরীক্ষাই 100 নম্বরের হয়। তারপর বার্ষিক পরীক্ষার 50%,  দ্বিতীয় সাময়িক পরীক্ষার 25% ও প্রথম সাময়িক পরীক্ষার 25% নিয়ে চূড়ান্ত ফলাফল প্রকাশ করা হয়। তাহলে আমাদের প্রোগ্রামের ইনপুট হচ্ছে ওই তিনটি পরীক্ষার নম্বর। আমাদেরকে চূড়ান্ত ফলাফল দেখাতে হবে। এটি কোনো ব্যাপারই নয়:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int ft_marks, st_marks, final_marks;   \n" +
                        "     double total_marks;   \n" +
                        "     ft_marks = 80;   \n" +
                        "     st_marks = 74;   \n" +
                        "     final_marks = 97;   \n" +
                        "     total_marks = ft_marks / 4.0 + st_marks / 4.0 + final_marks / 2.0;   \n" +
                        "     printf(\"%0.0lf\\n\", total_marks);   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.১  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "প্রোগ্রামটির আউটপুট 87। (কিন্তু আমি যদি total_marks = ft_marks / 4.0 + st_marks / 4.0 + final_marks / 2.0; না লিখে এভাবে লিখতাম total_marks = ft_marks / 4 + st_marks / 4 + final_marks / 2; তাহলে আউটপুট আসে 86। কারণ কী? কম্পিউটারের মাথা খারাপ নাকি আমার?)<br>\n" +
                        "<br>\n" +
                        "আমরা কিন্তু আমাদের প্রিয় শিক্ষকের তেমন কোনো উপকার করতে পারলাম না। কারণ তাঁর ক্লাসে মোট ছাত্রছাত্রীর সংখ্যা চল্লিশ। তাহলে স্যারকে চল্লিশবার প্রোগ্রামটি চালাতে হবে! কিন্তু এটি তো কোনো কাজের কথা হলো না। আমাদের উচিত, সবার চূড়ান্ত ফলাফল একটি প্রোগ্রামের মাধ্যমে নির্ণয় করা। তেমন কোনো কঠিন কাজ নয় এটি। আমরা এমন একটি প্রোগ্রাম লেখা শুরু করে দিতে পারি:<br>\n" +
                        "<br>\n" +
                        "#include<stdio .h=\".h\"><br>\n" +
                        "<br>\n" +
                        "int main()<br>\n" +
                        "{<br>\n" +
                        "int ft_marks_1, st_marks_1, final_marks_1, ft_marks_2, st_marks_2, final_marks_2, ft_marks_3, st_marks_3, final_marks_3, <br>\n" +
                        "<br>\n" +
                        "তোমরা নিশ্চয়ই বুঝতে পারছ, আমি কী করতে যাচ্ছি? বলো তো এভাবে প্রোগ্রামটি লিখতে গেলে মোট কয়টি ভেরিয়েবলের দরকার? 160টি। স্যারের কষ্ট কমাতে গিয়ে আমাদের কষ্ট এত বাড়ানোর কোনো মানে হয় না। কিন্তু এধরনের প্রোগ্রাম তো আমাদের প্রায়ই লিখতে হবে। চিন্তা নেই! প্রায় সব প্রোগ্রামিং ল্যাংগুয়েজেই অ্যারে (Array) নামে একটি চমৎকার জিনিস আছে। এতে একই ধরনের অনেকগুলো ভেরিয়েবল একসঙ্গে রাখা যায়। ভেরিয়েবলের যেমন নাম রাখি, অ্যারের বেলাতেও তেমন একটি নাম দিতে হয়। Cতেও অ্যারে আছে।<br>\n" +
                        "<br>\n" +
                        "ভেরিয়েবলের যেমন একটি ডাটা টাইপ থাকে, অ্যারেরও থাকে। অ্যারেটি যে ডাটা টাইপের হবে তাতে কেবল সেই রকম ডাটাই রাখা যাবে। যেমন char টাইপের অ্যারেতে কেবল char টাইপের জিনিস থাকবে।  <br>\n" +
                        "<br>\n" +
                        "অ্যারেতে কয়টি উপাদান থাকবে সেটি শুরুতেই বলে দিতে হয়।<br>\n" +
                        "int ara[10]; এভাবে আমরা একটি অ্যারে ডিক্লেয়ার করতে পারি, যার নাম হচ্ছে ara, যেটিতে কেবল ইন্টিজার টাইপের ডাটা থাকবে আর এই অ্যারেতে মোট দশটি সংখ্যা রাখা যাবে। প্রথমটি হচ্ছে ara[0] (হ্যাঁ, ara[1] না কিন্তু), দ্বিতীয়টি ara[1], তৃতীয়টি ara[2], এভাবে দশম সংখ্যাটি হচ্ছে ara[9]। অর্থাৎ, ara[i] হচ্ছে i+1তম উপাদান।<br>\n" +
                        "<br>\n" +
                        "এবারে চলো অ্যারে নিয়ে একটু খেলাধুলা করা যাক। প্রতিটি প্রোগ্রাম কিন্তু অবশ্যই কম্পিউটারে চালিয়ে দেখবে।<br>\n" +
                        "<br>\n" +
                        "</stdio><br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int ara[5] = {10, 20, 30, 40, 50};   \n" +
                        "     printf(\"First element: %d\\n\", ara[0]);   \n" +
                        "     printf(\"Third element: %d\\n\", ara[2]);    \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.২  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "আউটপুট ঠিকঠাক দেখতে পাচ্ছ?<br>\n" +
                        "<br>\n" +
                        "আরেকটি প্রোগ্রাম:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {    \n" +
                        "     int ara[5] = {6, 7, 4, 6, 9};   \n" +
                        "     printf(\"%d\\n\", ara[-1]);   \n" +
                        "     printf(\"%d\\n\", ara[5]);   \n" +
                        "     printf(\"%d\\n\", ara[100]);    \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৩  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এটির জন্য কী আউটপুট আসা উচিত? আমি জানি না এবং এটি জানা সম্ভব নয়। যেকোনো ধরনের সংখ্যা আসতে পারে। এগুলোকে গারবেজ (garbage) বলে। কারণ আসলে তো ওই অ্যারেতে -1, 5, 100 এই ইনডেক্স বলতে কিছু নেই। অ্যারেটির দৈর্ঘ্যই হচ্ছে 5 সুতরাং ইনডেক্স হবে 0 থেকে 4।<br>\n" +
                        "<br>\n" +
                        "এখন কোনো অ্যারের সব উপাদান যদি একসঙ্গে দেখাতে চাই, তাহলে উপায় কী? উপায় হচ্ছে প্রথম উপাদান (ara[0]), দ্বিতীয় উপাদান (ara[1]), তৃতীয় উপাদান (ara[2]) … এভাবে একে একে সবগুলো প্রিন্ট করা। আর তার জন্য অবশ্যই আমরা লুপের সাহায্য নেব।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int ara[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};   \n" +
                        "     int i;   \n" +
                        "     for(i = 0; i &lt; 10; i++) {   \n" +
                        "         printf(\"%d th element is: %d\\n\", i+1, ara[i]);   \n" +
                        "     }    \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৪  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "আর যদি শেষ উপাদান থেকে প্রথম উপাদান পর্যন্ত দেখাতে হতো? কোনো সমস্যা নেই, শুধু লুপে এ indexটি 9 থেকে 0 পর্যন্ত আনলেই চলবে। এখন তোমরা প্রোগ্রামটি লিখে ফেলো।<br>\n" +
                        "<br>\n" +
                        "এবারে একটি ছোট সমস্যা। কোনো একটি অ্যারেতে দশটি উপাদান আছে, সেগুলো বিপরীত ক্রমে রাখতে হবে। অর্থাৎ দশম উপাদানটি হবে প্রথম উপাদান, প্রথমটি হবে দশম, দ্বিতীয়টি হবে নবম, নবমটি হবে দ্বিতীয়.. এই রকম। তার জন্য আমরা যেটি করতে পারি, আরেকটি অ্যারের সাহায্য নিতে পারি। দ্বিতীয় অ্যারেটিতে প্রথম অ্যারের উপাদানগুলো বিপরীত ক্রমে রাখবো। তারপর দ্বিতীয় অ্যারেটি প্রথম অ্যারেতে কপি করে ফেলব।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int ara[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};   \n" +
                        "     int ara2[10];   \n" +
                        "     int i, j;   \n" +
                        "     for(i = 0, j = 9; i &lt; 10; i++, j--) {   \n" +
                        "         ara2[j] = ara[i];   \n" +
                        "     }    \n" +
                        "     for(i = 0; i &lt; 10; i++) {   \n" +
                        "         ara[i] = ara2[i];   \n" +
                        "     }   \n" +
                        "     for(i = 0; i &lt; 10; i++) {   \n" +
                        "         printf(\"%d\\n\", ara[i]);   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৫  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এখানে লক্ষ করো যে প্রথম অ্যারেটির ক্ষেত্রে আমি তৃতীয় বন্ধনীর ভেতর অ্যারের উপাদান সংখ্যা বলে দিইনি, কারণ সি-এর কম্পাইলার দ্বিতীয় বন্ধনীর ভেতর সংখ্যাগুলো দেখেই বুঝে নিতে পারে যে araতে দশটি উপাদান আছে। দ্বিতীয় অ্যারে অর্থাৎ ara2তে এখন কোনো কিছু নেই। তাই শুরুতেই বলে দিতে হবে যে তাতে কয়টি উপাদান থাকবে। তাহলে কম্পাইলার সেই অনুসারে কম্পিউটারের মেমোরির মধ্যে অ্যারের জন্য জায়গা করে নেবে। <br>\n" +
                        "<br>\n" +
                        "প্রোগ্রামটি ভালোভাবেই কাজ করছে। কিন্তু তোমরা একটু চিন্তাভাবনা করলেই বুঝতে পারবে যে দ্বিতীয় অ্যারেটি ব্যবহার করার কোনো দরকার ছিল না। আমরা একটি বহুল প্রচলিত পদ্ধতিতেই কাজটি করতে পারতাম।<br>\n" +
                        "int temp;<br>\n" +
                        "temp = ara[9];<br>\n" +
                        "ara[9] = ara[0];<br>\n" +
                        "ara[0] = temp;<br>\n" +
                        "প্রথম ও দশম উপাদান অদলবদল হয়ে গেল। তারপর <br>\n" +
                        "temp = ara[8];<br>\n" +
                        "ara[8] = ara[1];<br>\n" +
                        "ara[1] = temp;<br>\n" +
                        "দ্বিতীয় ও নবম উপাদান অদলবদল হয়ে গেল। তাহলে চলো প্রোগ্রামটি লিখে ফেলি:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int ara[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};    \n" +
                        "     int i, j, temp;   \n" +
                        "     for(i = 0, j = 9; i &lt; 10; i++, j--) {   \n" +
                        "         temp = ara[j];   \n" +
                        "         ara[j] = ara[i];   \n" +
                        "         ara[i] = temp;   \n" +
                        "     }    \n" +
                        "     for(i = 0; i &lt; 10; i++) {   \n" +
                        "         printf(\"%d\\n\", ara[i]);   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৬  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "প্রোগ্রামটি চালাও। কী দেখলে? আউটপুট কি এরকম?<br>\n" +
                        "10 <br>\n" +
                        "20 <br>\n" +
                        "30 <br>\n" +
                        "40 <br>\n" +
                        "50 <br>\n" +
                        "60 <br>\n" +
                        "70 <br>\n" +
                        "80 <br>\n" +
                        "90 <br>\n" +
                        "100<br>\n" +
                        "<br>\n" +
                        "তারমানে কাজ হয়নি! আসলে আমি একটি ছোট্ট ভুল করেছি, সেটি তোমরা খুঁজে বের করো। এ ধরনের ভুলকে বলে বাগ (bug), তখন প্রোগ্রাম ঠিকমতো রান করে কিন্তু সঠিক আউটপুট দেয় না। আমার কোডে বাগ আছে, তোমরা ডিবাগ (debug) করো (মানে বাগটি বের করে ঠিক করো)।<br>\n" +
                        "<br>\n" +
                        "এখন চলো আমাদের আগের সমস্যায় ফিরে যাই। আমরা এখন প্রথম সাময়িক পরীক্ষায় সবার গণিতের নম্বর একটি অ্যারেতে রাখব, দ্বিতীয় সাময়িক পরীক্ষার নম্বর আরেকটি অ্যারেতে, বার্ষিক পরীক্ষার নম্বরের জন্য আরও একটি এবং রেজাল্টের জন্যও একটি অ্যারে ব্যবহার করব।<br>\n" +
                        "<br>\n" +
                        "int ft_marks[40], st_marks[40], final_marks[40]; <br>\n" +
                        "double total_marks[40];<br>\n" +
                        "<br>\n" +
                        "যার রোল নম্বর 1 তার নম্বরগুলো থাকবে অ্যারের প্রথম ঘরে (মানে index 0 হবে)। এখন বলো তো total_marks[34]-এ কার সর্বমোট নম্বর আছে? যার রোল নম্বর 35। তাহলে কারও রোল নম্বর n হলে তার সর্বমোট নম্বর হচ্ছে total_marks[n-1]।<br>\n" +
                        "<br>\n" +
                        "এখন প্রোগ্রামটি লিখে ফেলা যাক:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int ft_marks[40] = {83, 86, 97, 95, 93, 95, 86, 52, 49, 41, 42, 47, 90, 59, 63, 86, 40, 46, 92, 56, 51, 48, 67, 49, 42, 90, 42, 83, 47, 95, 69, 82, 82, 58, 69, 67, 53, 56, 71, 62},   \n" +
                        "     st_marks[40] = {86, 97, 95, 93, 95, 86, 52, 49, 41, 42, 47, 90, 59, 63, 86, 40, 46, 92, 56, 51, 48, 67, 49, 42, 90, 42, 83, 47, 95, 69, 82, 82, 58, 69, 67, 53, 56, 71, 62, 49},   \n" +
                        "     final_marks[40] = {87, 64, 91, 43, 89, 66, 58, 73, 99, 81, 100, 64, 55, 69, 85, 81, 80, 67, 88, 71, 62, 78, 58, 66, 98, 75, 86, 90, 80, 85, 100, 64, 55, 69, 85, 81, 80, 67, 88, 71};   \n" +
                        "     int i;   \n" +
                        "     double total_marks[40];   \n" +
                        "     for(i = 0; i &lt; 40; i++) {   \n" +
                        "         total_marks[i] = ft_marks[i] / 4.0 + st_marks[i] / 4.0 + final_marks[i] / 2.0;   \n" +
                        "     }    \n" +
                        "     for(i = 1; i &lt;= 40; i++) {   \n" +
                        "         printf(\"Roll NO: %d\\tTotal Marks: %0.0lf\\n\", i, total_marks[i-1]);   \n" +
                        "     }   \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৭  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "রান করে দেখো, কী সুন্দর আউটপুট!  printf ফাংশনের ভেতরে দেখো এক জায়গায় আমি \\t লিখেছি, এতে ট্যাব (Tab) প্রিন্ট হবে (কিবোর্ডের বাঁ দিকে দেখো)। রোল নং প্রিন্ট করার পরে একটি ট্যাব দিয়ে টোটাল মার্কস প্রিন্ট করলে দেখতে একটু ভালো লাগে এই জন্য \\t ব্যবহার করেছি, এমনিতে কোনো দরকার নেই। <br>\n" +
                        "<br>\n" +
                        "কিন্তু এত সুন্দর প্রোগ্রাম দেখে তোমার শিক্ষক কোথায় তোমাকে একটু চটপটি খাওয়াবেন না উল্টা আরেকটি আবদার করে বসলেন। কোন নম্বর কতজন পেয়েছে সেটি উনি দেখতে চান। মানে 50 কতজন পেল, 51 কতজন পেল … এই রকম আর কি। বাকি অংশ পড়ার আগে প্রোগ্রামটি তোমরা নিজে নিজে লিখার চেষ্টা করো। এখন ইচ্ছা না করলে বইটি পড়া বন্ধ করে দাও এবং পরে কোনো একসময় চেষ্টা করবে। <br>\n" +
                        "<br>\n" +
                        "আশা করি, তোমাদের মধ্যে কেউ কেউ প্রোগ্রামটি লিখে ফেলেছ। যদি কমপক্ষে এক ঘণ্টা চেষ্টার পরেও লিখতে না পারো তাহলে এখন আমরা সমাধানের চেষ্টা করতে পারি। শুরুতেই একটি ব্যাপার খেয়াল করো যে কেউ কিন্তু 50-এর নিচে নম্বর পায়নি। তাই 50 থেকে 100 পর্যন্ত কোন নম্বর কতজন পেল সেটি বের করলেই চলবে। আমার মাথায় প্রথমেই যে সমাধান আসছে সেটি হলো total_marks অ্যারেতে প্রথমে দেখব, কয়টি 50 আছে, তারপর আবার দেখব কয়টি 51 আছে … এভাবে 100 পর্যন্ত দেখব। মানে 50 থেকে 100 পর্যন্ত সব সংখ্যার জন্য total_marks অ্যারেতে সংখ্যাগুলো চেক করব।<br>\n" +
                        "for(marks = 50; marks &lt;= 100; marks++) { লুপের সাহায্যে প্রথমে marks-এর মান 50, তারপরে 51, এভাবে এক এক করে বাড়াব 100 পর্যন্ত।<br>\n" +
                        "count = 0; ধরে নিচ্ছি শূন্য জন 'marks' নম্বর পেয়েছে। marks-এর সব কটি মানের জন্যই প্রথমে আমরা এই কাজটি করব।         এবারে total_marks অ্যারেতে দেখব যে কোনো নম্বর যদি marks-এর সমান হয়, তবে count-এর মান এক বাড়িয়ে দেব। তাহলে কোনো একটি নম্বর (marks) যতবার অ্যারেতে আছে, count-এর মান তত হবে।<br>\n" +
                        "&nbsp; for(i = 0; i &lt; 40; i++) {<br>\n" +
                        "&nbsp; &nbsp; &nbsp; if(total_marks[i] == marks) {<br>\n" +
                        "&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; count++;<br>\n" +
                        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; }<br>\n" +
                        "&nbsp; }&nbsp; <br>\n" +
                        "&nbsp; printf(\"Marks: %d  Count: %d\\n\", marks, count); এখানে আমরা প্রতিটি marks এবং সেটি&nbsp; কতবার আছে (count) তা প্রিন্ট করে দিচ্ছি।<br>\n" +
                        "}<br>\n" +
                        "তাহলে পুরো প্রোগ্রাম লিখে ফেলি:  <br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int marks, i, count;   \n" +
                        "     int total_marks[] = {86, 78, 94, 68, 92, 78, 64, 62, 72, 61, 72, 66, 65, 65, 80, 72, 62, 68, 81, 62, 56, 68, 58, 56, 82, 70, 74, 78, 76, 84, 88, 73, 62, 66, 76, 70, 67, 65, 77, 63};   \n" +
                        "     for(marks = 50; marks &lt;= 100; marks++) {   \n" +
                        "         count = 0;   \n" +
                        "         for(i = 0; i &lt; 40; i++) {   \n" +
                        "             if(total_marks[i] == marks) {   \n" +
                        "                 count++;   \n" +
                        "             }   \n" +
                        "         }   \n" +
                        "         printf(\"Marks: %d Count: %d\\n\", marks, count);   \n" +
                        "     }        \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৮  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "তেমন কঠিন কিছু নয়। নেস্টেড ফর লুপ ব্যবহার করে সহজ-সরল সমাধান করে ফেললাম। আচ্ছা বলো তো if-এর ভেতর যে শর্তটি আমরা পরীক্ষা করছি (total_marks[i] == marks) এই কাজটি প্রোগ্রামে কতবার হয়? বাইরের লুপটি ঘুরবে 51 বার এবং প্রতিবারের জন্য ভেতরের লুপটি ঘুরবে 40 বার। তাহলে মোট 51 x 40 = 2040 বার।<br>\n" +
                        "<br>\n" +
                        "ওপরের প্রোগ্রামটি আমরা এখন একটু অন্যভাবে লিখার চেষ্টা করব। নিচের প্রোগ্রামটি চটপট টাইপ করে ফেলো এবং রান করো:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int i;   \n" +
                        "     int total_marks[] = {86, 78, 94, 68, 92, 78, 64, 62, 72, 61, 72, 66, 65, 65, 80, 72, 62, 68, 81, 62, 56, 68, 58, 56, 82, 70, 74, 78, 76, 84, 88, 73, 62, 66, 76, 70, 67, 65, 77, 63};   \n" +
                        "     int marks_count[101];   \n" +
                        "     for(i = 0; i &lt; 101; i++) {   \n" +
                        "         marks_count[i] = 0;   \n" +
                        "     }   \n" +
                        "     for(i = 0; i &lt; 40; i++) {   \n" +
                        "         marks_count[total_marks[i]]++;   \n" +
                        "     }   \n" +
                        "     for(i = 50; i &lt;= 100; i++) {   \n" +
                        "         printf(\"Marks: %d Count: %d\\n\", i, marks_count[i]);   \n" +
                        "     }        \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.৯  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এখানে আমি যেটি করেছি, একটি অতিরিক্ত অ্যারে ব্যবহার করেছি। marks_count একটি ইন্টিজার টাইপের অ্যারে এবং marks_count[n] দিয়ে আমরা বুঝব n সংখ্যাটি কতবার total_marks-এর মধ্যে আছে। নম্বর যেহেতু 0 থেকে 100-এর মধ্যে হতে পারে তাই আমরা ওই অ্যারেতে মোট 101টি সংখ্যা রাখার ব্যবস্থা করলাম। int marks_count[101];<br>\n" +
                        "শুরুতে যেহেতু কিছুই জানি না, তাই ধরে নিই, সব সংখ্যা শূন্য বার আছে। তাই marks_count অ্যারের সব ঘরে 0 বসিয়ে দিই:<br>\n" +
                        "for(i = 0; i &lt; 101; i++) {      marks_count[i] = 0;  } এখন total_marks অ্যারের প্রতিটি সংখ্যার জন্য marks_count অ্যারের ওই ঘরের মান এক বাড়িয়ে দিই। for(i = 0; i &lt; 40; i++) {      marks_count[total_marks[i]]++;  }  বুঝতে সমস্যা হচ্ছে নাকি? একটু চিন্তা করো।   যখন i-এর মান 0, তখন total_marks[i] হচ্ছে total_marks[0], অর্থাৎ 86। এখন আমাদের দরকার হচ্ছে marks_count অ্যারের ওই ঘরটার (মানে marks_count[86]) মান এক বাড়িয়ে দেওয়া। শুরুতে ছিল শূন্য, এখন হবে এক। আমরা কিন্তু সে কাজটিই করেছি marks_count[total_marks[i]]-এর মান এক বাড়িয়ে দিয়েছি marks_count[total_marks[i]]++; আসলে ব্যাপারটি এইভাবেও লেখা যেত: t_m = total_marks[i]; marks_count[t_m]++; এখনো যারা মাথা চুলকাচ্ছ তারা নিচের প্রোগ্রামটি কম্পিউটারে রান করাও। এখানে প্রতিবার marks_count[total_marks[i]]++; করার পরে marks_count অ্যারেটি আমরা এক লাইনে প্রিন্ট করেছি।  <br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     int i, j;   \n" +
                        "     int total_marks[] = {6, 7, 4, 6, 9, 7, 6, 2, 4, 3, 4, 1};   \n" +
                        "     int marks_count[11];   \n" +
                        "     for(i = 0; i &lt; 11; i++) {   \n" +
                        "         marks_count[i] = 0;   \n" +
                        "     }   \n" +
                        "     for(i = 0; i &lt; 12; i++) {   \n" +
                        "         marks_count[total_marks[i]]++;   \n" +
                        "         for(j = 0; j &lt;= 10; j++) {   \n" +
                        "             printf(\"%d \", marks_count[j]);   \n" +
                        "         }   \n" +
                        "         printf(\"\\n\");      \n" +
                        "     }       \n" +
                        "     return 0;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৬.১০  </code></pre>\n" +
                        "<div>\n" +
                        "<br></div>\n" +
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
