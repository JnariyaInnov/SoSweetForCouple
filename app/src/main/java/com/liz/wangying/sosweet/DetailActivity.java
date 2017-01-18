package com.liz.wangying.sosweet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.jorgecastillo.FillableLoader;
import com.github.jorgecastillo.clippingtransforms.WavesClippingTransform;
import com.github.jorgecastillo.listener.OnStateChangeListener;
import com.liz.wangying.sosweet.utils.LogoPaths;
import com.liz.wangying.sosweet.utils.SVGPathView;

/**
 * .,:,,,                                        .::,,,::.
 * .::::,,;;,                                  .,;;:,,....:i:
 * :i,.::::,;i:.      ....,,:::::::::,....   .;i:,.  ......;i.
 * :;..:::;::::i;,,:::;:,,,,,,,,,,..,.,,:::iri:. .,:irsr:,.;i.
 * ;;..,::::;;;;ri,,,.                    ..,,:;s1s1ssrr;,.;r,
 * :;. ,::;ii;:,     . ...................     .;iirri;;;,,;i,
 * ,i. .;ri:.   ... ............................  .,,:;:,,,;i:
 * :s,.;r:... ....................................... .::;::s;
 * ,1r::. .............,,,.,,:,,........................,;iir;
 * ,s;...........     ..::.,;:,,.          ...............,;1s
 * :i,..,.              .,:,,::,.          .......... .......;1,
 * ir,....:rrssr;:,       ,,.,::.     .r5S9989398G95hr;. ....,.:s,
 * ;r,..,s9855513XHAG3i   .,,,,,,,.  ,S931,.,,.;s;s&BHHA8s.,..,..:r:
 * :r;..rGGh,  :SAG;;G@BS:.,,,,,,,,,.r83:      hHH1sXMBHHHM3..,,,,.ir.
 * ,si,.1GS,   sBMAAX&MBMB5,,,,,,:,,.:&8       3@HXHBMBHBBH#X,.,,,,,,rr
 * ;1:,,SH:   .A@&&B#&8H#BS,,,,,,,,,.,5XS,     3@MHABM&59M#As..,,,,:,is,
 * .rr,,,;9&1   hBHHBB&8AMGr,,,,,,,,,,,:h&&9s;   r9&BMHBHMB9:  . .,,,,;ri.
 * :1:....:5&XSi;r8BMBHHA9r:,......,,,,:ii19GG88899XHHH&GSr.      ...,:rs.
 * ;s.     .:sS8G8GG889hi.        ....,,:;:,.:irssrriii:,.        ...,,i1,
 * ;1,         ..,....,,isssi;,        .,,.                      ....,.i1,
 * ;h:               i9HHBMBBHAX9:         .                     ...,,,rs,
 * ,1i..            :A#MBBBBMHB##s                             ....,,,;si.
 * .r1,..        ,..;3BMBBBHBB#Bh.     ..                    ....,,,,,i1;
 * :h;..       .,..;,1XBMMMMBXs,.,, .. :: ,.               ....,,,,,,ss.
 * ih: ..    .;;;, ;;:s58A3i,..    ,. ,.:,,.             ...,,,,,:,s1,
 * .s1,....   .,;sh,  ,iSAXs;.    ,.  ,,.i85            ...,,,,,,:i1;
 * .rh: ...     rXG9XBBM#M#MHAX3hss13&&HHXr         .....,,,,,,,ih;
 * .s5: .....    i598X&&A&AAAAAA&XG851r:       ........,,,,:,,sh;
 * . ihr, ...  .         ..                    ........,,,,,;11:.
 * ,s1i. ...  ..,,,..,,,.,,.,,.,..       ........,,.,,.;s5i.
 * .:s1r,......................       ..............;shs,
 * . .:shr:.  ....                 ..............,ishs.
 * .,issr;,... ...........................,is1s;.
 * .,is1si;:,....................,:;ir1sr;,
 * ..:isssssrrii;::::::;;iirsssssr;:..
 * .,::iiirsssssssssrri;;:.
 */
public class DetailActivity extends AppCompatActivity implements OnStateChangeListener, ResettableView {
    //    @Bind(R.id.fillableLoader)@Nullable  FillableLoader fillableLoader;
    FillableLoader fillableLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ButterKnife.bind(this);
        setContentView(R.layout.activity_detail);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
         fillableLoader = (FillableLoader) findViewById(R.id.fillableLoader);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "ff", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        fillableLoader.setSvgPath(LogoPaths.WONENG_LC_LOGO_PATH);
        fillableLoader.setClippingTransform(new WavesClippingTransform());
        fillableLoader.setOnStateChangeListener(this);
        fillableLoader.start();

        final SVGPathView pathView = (SVGPathView) findViewById(R.id.svg_path_view);
        pathView.setSvgPath(LogoPaths.WONENG_LC_LOGO_PATH);
        pathView.start();
        final SVGPathView pathView1 = (SVGPathView) findViewById(R.id.svg_path_view1);
        pathView1.setSvgPath(LogoPaths.MoneyLogo);
        pathView1.start();
        final SVGPathView pathView2 = (SVGPathView) findViewById(R.id.svg_path_view2);
        pathView2.setSvgPath(LogoPaths.PIGGY);
        pathView2.start();
        final SVGPathView pathView3 = (SVGPathView) findViewById(R.id.svg_path_view3);
        pathView3.setSvgPath(LogoPaths.CLOCK);
        pathView3.start();
        final SVGPathView pathView4 = (SVGPathView) findViewById(R.id.svg_path_view4);
        pathView4.setSvgPath(LogoPaths.ONE_HUNDRED);
        pathView4.start();

    }

    @Override
    public void onStateChange(int state) {
//        showsta
    }

    @Override
    public void reset() {
        fillableLoader.postDelayed(new Runnable() {
            @Override
            public void run() {
                fillableLoader.start();
            }
        }, 250);
    }
}