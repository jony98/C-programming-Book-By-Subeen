package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

import java.io.IOException;
import java.io.InputStream;

public class First extends AppCompatActivity {

    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        tv1 = findViewById(R.id.chap1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় এক");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView = (HtmlTextView) findViewById(R.id.html_text);
        htmlTextView.setHtml("<html lang=\"en\">\n" +
                        "<head>\n" +

                        "</head>\n" +
                        "<body>\n" +
                        "<div class=\"post hentry\">\n" +
                        "    <a name=\"8093807084769659916\"></a>\n" +
                        "    <h3 class=\"post-title entry-title\">\n" +
                        "        [প্রোগ্রামিং বইঃ অধ্যায় এক] প্রথম প্রোগ্রাম।\n" +
                        "    </h3>\n" +
                        "    <div class=\"post-header\">\n" +
                        "        <div class=\"post-header-line-1\"></div>\n" +
                        "    </div>\n" +
                        "    <div class=\"post-body entry-content\" id=\"post-body-8093807084769659916\">\n" +
                        "        <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                        "            <div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                        "                <div style=\"text-align: justify;\">\n" +
                        "                    প্রোগ্রামিংয়ের জগতে স্বাগতম!<br>\n" +
                        "                    <br>\n" +
                        "                    আমরা এখন একটি প্রোগ্রাম লিখে ফেলব, যেটি তোমার কম্পিউটারের স্ক্রিনে Hello World দেখাবে বা প্রিন্ট করবে। এটি হচ্ছে প্রোগ্রামিংয়ের একটি ঐতিহ্য। পৃথিবীর অধিকাংশ প্রোগ্রামারই জীবনের প্রথম প্রোগ্রাম হিসেবে এটি লেখে। আমি এই বইয়ের প্রোগ্রামগুলো চালানোর জন্য Codeblocks ব্যবহার করব। তবে তোমরা অন্য কিছু ব্যবহার করলেও কোনো সমস্যা নেই, সবগুলোতে কাজের ধারা মোটামুটি একই রকম। কম্পিউটারে কোডব্লকস ইনস্টল করে ফেলো। নিজে নিজে ইনস্টল করতে না পারলে ইউটিউবে <a href=\"https://www.youtube.com/watch?v=U8qOLFXixtE\">এই ভিডিওটি</a> দেখো।</div>\n" +
                        "                <div style=\"text-align: justify;\">\n" +
                        "                    ইনস্টল হয়ে গেল। এখন উইন্ডোজের Start মেনুতে Programs-এ গিয়ে Codeblocks চালু করো। উবুন্টুতে এটি থাকবে Applications &gt; Programming-এর ভেতর।</div>\n" +
                        "                <br>\n" +
                        "                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                    এখন তোমরা প্রোগ্রামগুলো রাখার জন্য হার্ডডিস্কের ভেতর একটি ফোল্ডার তৈরি করে নাও। ওই ফোল্ডারে ফাইলগুলো সেভ (Save)করবে। ফাইলের যেকোনো একটি নাম দাও। আর Save as type হবে C/C++ files।</div>\n" +
                        "                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                        এখন আমরা আমাদের কোড বা প্রোগ্রাম লিখব। নিচের কোডটি টাইপ করে ফেলো এবং ফাইলটি সেভ করো।</div>\n" +
                        "                    <br>\n" +
                        "প্রোগ্রাম: ১.১\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-size: 12px; font-family: arial; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\">\n" +
                        "#include &lt;stdio.h&gt;\n" +
                        "int main ()\n" +
                        "{\n" +
                        "    printf(\"Hello World\");\n" +
                        "    return 0;\n" +
                        "}\n" +
                        "</code></pre>\n" +
                        "\n" +
                        "                    <br>\n" +
                        "                    <div class=\"separator\" style=\"clear: both; text-align: center;\">\n" +
                        "\n" +
                        "                        <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                            তোমরা হয়তো চিন্তা করছ, আমি এই হিজিবিজি কী লিখলাম? আস্তে ধীরে সব ব্যাখ্যা করব<span style=\"font-size: small;\">, </span>চিন্তা নেই<span style=\"font-size: small;\">! </span>আপাতত আমার কথামতো কাজ করে যাও। এবার <span style=\"font-size: small;\">Build </span>মেনুতে গিয়ে <span style=\"font-size: small;\">Compile Current File-</span>এ ক্লিক করো।</div>\n" +
                        "                        <div class=\"separator\" style=\"clear: both; text-align: center;\">\n" +
                        "                            <br>\n" +
                        "                            <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                তুমি যদি প্রোগ্রামটি ঠিকভাবে টাইপ করে থাকো তবে কম্পাইলার তোমাকে বলবে যে <span style=\"font-size: small;\">0 errors, 0 warnings, </span>মানে <span style=\"font-size: small;\">- </span>প্রোগ্রামে <span style=\"font-size: small;\">syntax </span>ঠিক আছে।</div>\n" +
                        "                            <div class=\"separator\" style=\"clear: both; text-align: center;\">\n" +
                        "                                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                    এখন আবার <span style=\"font-size: small;\">Build </span>মেনুতে গিয়ে <span style=\"font-size: small;\">Run-</span>এ ক্লিক করো। তাহলে তোমার প্রোগ্রাম চালু হয়ে যাবে।</div>\n" +
                        "                                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                    এখানে দেখো<span style=\"font-size: small;\">, </span>তোমার প্রোগ্রামটি স্ক্রিনে <span style=\"font-size: small;\">Hello World </span>প্রিন্ট করেছে। পরের লাইনে বলা আছে <span style=\"font-size: small;\">Process returned 0 (0x0) (</span>এটির অর্থ নিয়ে আমাদের এখন মাথা না ঘামালেও চলবে<span style=\"font-size: small;\">) </span>আর <span style=\"font-size: small;\">execution time : 0.031 s </span>মানে প্রোগ্রামটি চলতে <span style=\"font-size: small;\">0.031 </span>সেকেন্ড সময় লেগেছে। তারপরের লাইন হচ্ছে<span style=\"font-size: small;\">, Press any key to continue.  </span>কি<span style=\"font-size: small;\">-</span>বোর্ডে <span style=\"font-size: small;\">Any key </span>খুঁজে না পেলে অন্য যেকোনো কি চাপলেই চলবে।</div>\n" +
                        "                                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                    তুমি যদি প্রোগ্রামটি ঠিকঠাকভাবে রান করাতে পারো এবং <span style=\"font-size: small;\">Hello World </span>লেখাটা দেখে থাকো তাহলে তোমাকে অভিনন্দন। তুমি বেশ গুরুত্বপূর্ণ একটি কাজ করে ফেলেছ।  </div>\n" +
                        "                                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                    <br></div>\n" +
                        "                                <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                    আর ঠিকঠাকভাবে রান করাতে না পারলে আবার শুরু থেকে চেষ্টা করো। প্রয়োজনে অভিজ্ঞ কারও সাহায্য নাও। কারণ এই প্রোগ্রাম না চালাতে পারলে বইয়ের পরের অংশ পড়ে তেমন একটি লাভ হবে না। <a href=\"https://www.youtube.com/watch?v=ybcQ04WeuUI\">এই ভিডিওটি</a> দেখতে পারো।<br>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <br></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        এবারে দেখা যাক আমি কী লিখেছি কোডে।  </div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        প্রথম লাইন ছিল<span style=\"font-size: small;\">: #include &lt;stdio.h&gt;,  </span>এটি কেন লিখেছি একটু পরে বলছি।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        দ্বিতীয় লাইন ফাঁকা। দেখতে সুন্দর লাগে তাই।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        তৃতীয় লাইন<span style=\"font-size: small;\">: int main()</span>। এটিকে বলে মেইন ফাংশন। সি প্রোগ্রামগুলো মেইন ফাংশন থেকে কাজ করা শুরু করে<span style=\"font-size: small;\">, </span>তাই সব প্রোগ্রামে একটি <span style=\"font-size: small;\">(</span>এবং কেবল একটি<span style=\"font-size: small;\">) </span>মেইন ফাংশন থাকতে হয়। মেইন ফাংশনের শুরুতে দ্বিতীয় বন্ধনী দিয়ে শুরু করতে হয় আর শেষও করতে হয় একটি দ্বিতীয় বন্ধনী দিয়ে। শেষ করার আগে আমি <span style=\"font-size: small;\">return 0; </span>লিখেছি<span style=\"font-size: small;\">, </span>সেটি কেন এখন ব্যাখ্যা না করলেই ভালো হয়<span style=\"font-size: small;\">, </span>ফাংশন নিয়ে যখন আলাপ করব তখন বলব। তাই আপাতত তোমরা যেকোনো প্রোগ্রামে নিচের অংশটুকু লিখে ফেলবে<span style=\"font-size: small;\">:</span></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <br></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <span style=\"font-size: small;\">int main()</span></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <span style=\"font-size: small;\">{</span></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        &nbsp;&nbsp;&nbsp; এখানে কোড থাকবে।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                    </div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <span style=\"font-size: small;\">&nbsp;&nbsp;&nbsp; return 0;</span></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <span style=\"font-size: small;\">}</span></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <br></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        প্রোগ্রামের পরের লাইন খেয়াল করো<span style=\"font-size: small;\">: printf(\"Hello World\"); </span>এটি একটি স্টেটমেন্ট। এখানে <span style=\"font-size: small;\">printf() </span>হচ্ছে একটি ফাংশন যার কাজ হচ্ছে স্ক্রিনে কিছু প্রিন্ট করা। ডবল কোটেশন চিহ্নের ভেতরে যা লিখবে তা<span style=\"font-size: small;\">-</span>ই স্ক্রিনে সে প্রিন্ট করবে। এই ফাংশনটি স্ক্রিনে প্রিন্ট করে কীভাবে সেটি আসলে বলা আছে <span style=\"font-size: small;\">stdio.h </span>নামে একটি ফাইলে। এই ফাইলগুলোকে বলে হেডার <span style=\"font-size: small;\">(header) </span>ফাইল <span style=\"font-size: small;\">(.h </span>হচ্ছে হেডার ফাইলের এক্সটেনশন<span style=\"font-size: small;\">)</span>। <span style=\"font-size: small;\">stdio.h </span>ফাইলে স্ট্যান্ডার্ড ইনপুট আর আউটপুট<span style=\"font-size: small;\">-</span>সংক্রান্ত যাবতীয় ফাংশন লেখা আছে<span style=\"font-size: small;\">, </span>আমরা কেবল সেগুলো ব্যবহার করব<span style=\"font-size: small;\">, </span>ফাংশনগুলো কীভাবে কাজ করে সেটি এখন আমাদের জানার দরকার নেই। আর যেহেতু <span style=\"font-size: small;\">printf() </span>ফাংশন ব্যবহার করেছি<span style=\"font-size: small;\">, </span>তাই প্রোগ্রামের শুরুতে <span style=\"font-size: small;\">#include &lt;stdio.h&gt; </span>লিখতে হয়েছে। এই রকম আরও অনেক প্রয়োজনীয় হেডার ফাইল আছে<span style=\"font-size: small;\">, </span>যার কিছু আমরা পরবর্তী সময়ে কাজের প্রয়োজনে দেখব।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <br></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        এখন একটি ব্যাপার খেয়াল করো। <span style=\"font-size: small;\">printf(\"Hello World\");-</span>এর শেষে একটি সেমিকোলন রয়েছে। সি ল্যাঙ্গুয়েজে প্রতিটি স্টেটমেন্টের পরেই একটি সেমিকোলন থাকে। একটি স্টেটমেন্টের কাজ শেষ হলে পরের স্টেটমেন্টের কাজ শুরু হয়। <span style=\"font-size: small;\">return 0;</span>ও একটি স্টেটমেন্ট<span style=\"font-size: small;\">, </span>তাই এটিও সেমিকোলন দিয়ে শেষ করতে হয়েছে। শুরুর দিকে অনেকেই সেমিকোলন দিতে ভুলে যায়<span style=\"font-size: small;\">, </span>তখন কম্পাইল এরর <span style=\"font-size: small;\">(compile error) </span>হয়। তোমরা একটি সেমিকোলন মুছে দিয়ে কম্পাইল করার চেষ্টা করে দেখতে পারো।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <br></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        এবারে একটি খুব গুরুত্বপূর্ণ কথা বলে রাখি। তোমরা কোডটি খেয়াল করলে দেখবে যে আমি <span style=\"font-size: small;\">#include &lt;stdio.h&gt;, int main(), { </span>ও <span style=\"font-size: small;\">} </span>যেই লাইনে আছে সেটি এডিটরের একেবারে বাঁ দিক থেকে শুরু করেছি। আর <span style=\"font-size: small;\">printf </span>এবং <span style=\"font-size: small;\">return 0-</span>এর আগে চারটি স্পেস <span style=\"font-size: small;\">(</span>ফাঁকা জায়গা<span style=\"font-size: small;\">) </span>দিয়ে নিয়েছি। এটিকে বলে ইনডেন্টেশন <span style=\"font-size: small;\">(Indentation)</span>। এরকম না করলেও প্রোগ্রামটি চলত এবং তাই অনেকেই ইন্ডেন্টেশনের ব্যাপারটি গুরুত্ব দেয় না এবং ঠিকমতো ইনডেন্টেশন করে না। যেকোনো ভালো অভ্যাসের মতো ইন্ডেন্টেশনের অভ্যাস তৈরি করাটা একটু কঠিন<span style=\"font-size: small;\">, </span>তবে বিষয়টা কিন্তু দাঁত মাজার মতোই গুরুত্বপূর্ণ। ইনডেন্টেশন করার অভ্যাস ঠিকমতো তৈরি না হলে প্রোগ্রামারদের সহকর্মী বা বসের বকা শুনতে হয়<span style=\"font-size: small;\">, </span>অনেক জায়গায় তো ইন্টারভিউতেই বাদ পড়ে যেতে হয়। আশা করছি তোমরা ব্যাপারটি বেশ গুরুত্ব সহকারে নেবে। আমি বইয়ের সমস্ত উদাহরণেই যথাযথভাবে ইনডেন্টেশন করার চেষ্টা করব তবে ছাপার সময় একটু এদিক<span style=\"font-size: small;\">-</span>ওদিক হতে পারে<span style=\"font-size: small;\">, </span>সেটি তোমরা বুঝে নেবে। ইন্ডেন্টশনের জন্য সাধারণত চারটি স্পেস দেওয়াটাই এখন স্ট্যান্ডার্ড। তোমরা এডিটরে অপশন সেট করতে পারো যাতে ট্যাব <span style=\"font-size: small;\">(Tab) </span>চাপলে সেটি চারটি স্পেসের সমান হয়। <span style=\"font-size: small;\">Codeblocks-</span>এ <span style=\"font-size: small;\">Settings </span>মেনুতে <span style=\"font-size: small;\">Editor-</span>এ ক্লিক করে <span style=\"font-size: small;\">TAB Options-</span>এ <span style=\"font-size: small;\">TAB indents </span>চেক করো এবং <span style=\"font-size: small;\">TAB size in spaces 4 </span>দাও।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        এবারে তোমাদের জন্য একটি কাজ। একটি প্রোগ্রাম লেখো যেটি স্ক্রিনে প্রিন্ট করবে<span style=\"font-size: small;\">: I love my country, Bangladesh</span>।</div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        <br></div>\n" +
                        "                                    <div align=\"JUSTIFY\" style=\"margin-bottom: 0in;\">\n" +
                        "                                        প্রোগ্রামটি টাইপ করার পরে অবশ্যই কম্পাইল ও রান করবে। কম্পাইল করার আগে সেভ করতে ভুলবে না।<br>\n" +
                        "                                        <br>\n" +
                        "                                    </div>\n" +
                        "</body>\n" +
                        "</html>\n",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
