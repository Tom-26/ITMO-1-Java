{\rtf1\ansi\ansicpg1251\cocoartf2580
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;\f1\fmodern\fcharset0 Courier-Oblique;}
{\colortbl;\red255\green255\blue255;\red195\green123\blue90;\red23\green23\blue26;\red174\green176\blue183;
\red71\green149\blue242;\red38\green157\blue169;\red103\green107\blue114;\red185\green101\blue173;\red89\green158\blue96;
}
{\*\expandedcolortbl;;\csgenericrgb\c76471\c48235\c35294;\csgenericrgb\c9020\c9020\c10196;\csgenericrgb\c68235\c69020\c71765;
\csgenericrgb\c27843\c58431\c94902;\csgenericrgb\c14902\c61569\c66275;\csgenericrgb\c40392\c41961\c44706;\csgenericrgb\c72549\c39608\c67843;\csgenericrgb\c34902\c61961\c37647;
}
\paperw11900\paperh16840\margl1440\margr1440\vieww16320\viewh10740\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\fs26 \cf2 \cb3 import \cf4 java.util.Random;\
\cf2 import \cf4 java.text.DecimalFormat;\
\cf2 public class \cf4 Lab1 \{\
    \cf2 public static void \cf5 main\cf4 (String[] args) \{\
        \cf2 long\cf4 [] c = \cf2 new long\cf4 [\cf6 14\cf4 ];\
        \cf2 float\cf4 [] x = \cf2 new float\cf4 [\cf6 20\cf4 ]; \cf7 //arr2\
        \cf2 double \cf4 [][] c2 = \cf2 new double\cf4 [\cf6 14\cf4 ][\cf6 20\cf4 ];\cf7 //arr3\
        // arr1 (3;16) in '+' progress\
        \cf2 long \cf4 min = \cf6 2\cf4 ; \cf7 //arr1\
        \cf2 for \cf4 (\cf2 int \cf4 i = \cf6 0\cf4 ; i < c.\cf8 length\cf4 ; i++) \{\
            c[i] = min;\
            min = min + \cf6 1\cf4 ;\
        \}\
        \cf7 // arr2 randomizee\
        \cf2 for \cf4 (\cf2 int \cf4 i = \cf6 0\cf4 ; i < x.\cf8 length\cf4 ; i++) \{\
            x[i] = ((\cf2 float\cf4 ) (Math.
\f1\i random
\f0\i0 () * \cf6 13.0\cf4 ) - \cf6 8\cf4 );\
        \}\
        \cf7 // arr3 if.swich\
        \cf2 for \cf4 (\cf2 int \cf4 i = \cf6 0\cf4 ; i < c2.\cf8 length\cf4 ; i++) \{\
            \cf2 for \cf4 (\cf2 int \cf4 j = \cf6 0\cf4 ; j < c2[i].\cf8 length\cf4 ; j++) \{\
                \cf2 if \cf4 (c[i] == \cf6 9\cf4 ) \{\
                    c2[i][j] = (Math.
\f1\i atan
\f0\i0 (\cf6 1\cf4 /(Math.
\f1\i pow
\f0\i0 (Math.
\f1\i \cf8 E
\f0\i0 \cf4 ,Math.
\f1\i acos
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1.5\cf4 )/\cf6 13\cf4 , \cf6 2\cf4 ))))));\
                \} \cf2 else \cf4 \{\
                    \cf2 switch \cf4 ((\cf2 int\cf4 ) c[i]) \{ \cf7 //swich/case operator\
                        \cf2 case \cf6 3\cf4 :\
                            c2[i][j] = (Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 )));\
                            \cf2 break\cf4 ;\
                        \cf2 case \cf6 10\cf4 :\
                            c2[i][j] = (Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 )));\
                            \cf2 break\cf4 ;\
                        \cf2 case \cf6 11\cf4 :\
                            c2[i][j] =(Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 ))) ;\
                            \cf2 break\cf4 ;\
                        \cf2 case \cf6 12\cf4 :\
                            c2[i][j] = (Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 )));\
                            \cf2 break\cf4 ;\
                        \cf2 case \cf6 14\cf4 :\
                            c2[i][j] = (Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 )));\
                            \cf2 break\cf4 ;\
                        \cf2 case \cf6 15\cf4 :\
                            c2[i][j] = (Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 )));\
                            \cf2 break\cf4 ;\
                        \cf2 case \cf6 16\cf4 :\
                            c2[i][j] = (Math.
\f1\i sin
\f0\i0 (Math.
\f1\i pow
\f0\i0 ((x[j]-\cf6 1\cf4 )/x[j], \cf6 1\cf4 /\cf6 3\cf4 )));\
                            \cf2 break\cf4 ;\
                        \cf2 default\cf4 :\
                            c2[i][j] = (Math.
\f1\i pow
\f0\i0 (\cf6 0.5\cf4 /Math.
\f1\i pow
\f0\i0 ((Math.
\f1\i atan
\f0\i0 ((x[j]-\cf6 1.5\cf4 )/\cf6 13\cf4 ))/((Math.
\f1\i cos
\f0\i0 (x[j]))- \cf6 2\cf4 /\cf6 3\cf4 ), (\cf6 3\cf4 /(Math.
\f1\i atan
\f0\i0 (Math.
\f1\i cos
\f0\i0 (x[j]))))),Math.
\f1\i pow
\f0\i0 (Math.
\f1\i atan
\f0\i0 ((x[j]-\cf6 1.5\cf4 )/\cf6 13\cf4 ),\cf6 1\cf4 /\cf6 3\cf4 )));\
                    \}\
                \}\
            \}\
\
\
        \}\
        \cf2 for \cf4 (\cf2 int \cf4 i = \cf6 0\cf4 ; i < \cf6 14\cf4 ; i++) \{\
            System.
\f1\i \cf8 out
\f0\i0 \cf4 .println();\
            \cf2 for \cf4 (\cf2 int \cf4 j = \cf6 0\cf4 ; j < \cf6 20\cf4 ; j++) \{\
                System.
\f1\i \cf8 out
\f0\i0 \cf4 .print(\cf2 new \cf4 DecimalFormat(\cf9 "#0.00"\cf4 ).format(c2[i][j]) + \cf9 " "\cf4 );\
            \}\
        \}\
\
    \}\
\}\
}