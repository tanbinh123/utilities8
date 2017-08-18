package net.sf.saxon.charcode;

/**
 * This class defines properties of the CP1251 Cyrillic character set, as defined at
 * <a href="http://www.microsoft.com/globaldev/reference/sbcs/1251.htm">http://www.microsoft.com/globaldev/reference/sbcs/1251.htm</a>.
 */
public class CP1251CharacterSet implements CharacterSet {

    public static final CP1251CharacterSet INSTANCE = new CP1251CharacterSet();

    private CP1251CharacterSet() {
    }

    public static CP1251CharacterSet getInstance() {
        return INSTANCE;
    }

    @Override
    public final boolean inCharset(int c) {
        return (c <= 0x7f)
                || (c >= 0x0401 && c <= 0x044F)
                || (c >= 0x0451 && c <= 0x045f)
                || (c == 0x0490)
                || (c == 0x0491)
                || (c > 0x2012 && c <= 0x2122 && ((c == 0x2013)
                || (c == 0x2014)
                || (c == 0x2018)
                || (c == 0x2019)
                || (c == 0x201A)
                || (c == 0x201C)
                || (c == 0x201D)
                || (c == 0x201E)
                || (c == 0x2020)
                || (c == 0x2021)
                || (c == 0x2022)
                || (c == 0x2026)
                || (c == 0x2030)
                || (c == 0x2039)
                || (c == 0x203A)
                || (c == 0x20AC)
                || (c == 0x2116)
                || (c == 0x2122)));
    }

}

// 80 = U+0402 : CYRILLIC CAPITAL LETTER DJE
// 81 = U+0403 : CYRILLIC CAPITAL LETTER GJE
// 82 = U+201A : SINGLE LOW-9 QUOTATION MARK
// 83 = U+0453 : CYRILLIC SMALL LETTER GJE
// 84 = U+201E : DOUBLE LOW-9 QUOTATION MARK
// 85 = U+2026 : HORIZONTAL ELLIPSIS
// 86 = U+2020 : DAGGER
// 87 = U+2021 : DOUBLE DAGGER
// 88 = U+20AC : EURO SIGN
// 89 = U+2030 : PER MILLE SIGN
// 8A = U+0409 : CYRILLIC CAPITAL LETTER LJE
// 8B = U+2039 : SINGLE LEFT-POINTING ANGLE QUOTATION MARK
// 8C = U+040A : CYRILLIC CAPITAL LETTER NJE
// 8D = U+040C : CYRILLIC CAPITAL LETTER KJE
// 8E = U+040B : CYRILLIC CAPITAL LETTER TSHE
// 8F = U+040F : CYRILLIC CAPITAL LETTER DZHE
// 90 = U+0452 : CYRILLIC SMALL LETTER DJE
// 91 = U+2018 : LEFT SINGLE QUOTATION MARK
// 92 = U+2019 : RIGHT SINGLE QUOTATION MARK
// 93 = U+201C : LEFT DOUBLE QUOTATION MARK
// 94 = U+201D : RIGHT DOUBLE QUOTATION MARK
// 95 = U+2022 : BULLET
// 96 = U+2013 : EN DASH
// 97 = U+2014 : EM DASH
// 99 = U+2122 : TRADE MARK SIGN
// 9A = U+0459 : CYRILLIC SMALL LETTER LJE
// 9B = U+203A : SINGLE RIGHT-POINTING ANGLE QUOTATION MARK
// 9C = U+045A : CYRILLIC SMALL LETTER NJE
// 9D = U+045C : CYRILLIC SMALL LETTER KJE
// 9E = U+045B : CYRILLIC SMALL LETTER TSHE
// 9F = U+045F : CYRILLIC SMALL LETTER DZHE
// A0 = U+00A0 : NO-BREAK SPACE
// A1 = U+040E : CYRILLIC CAPITAL LETTER SHORT U
// A2 = U+045E : CYRILLIC SMALL LETTER SHORT U
// A3 = U+0408 : CYRILLIC CAPITAL LETTER JE
// A4 = U+00A4 : CURRENCY SIGN
// A5 = U+0490 : CYRILLIC CAPITAL LETTER GHE WITH UPTURN
// A6 = U+00A6 : BROKEN BAR
// A7 = U+00A7 : SECTION SIGN
// A8 = U+0401 : CYRILLIC CAPITAL LETTER IO
// A9 = U+00A9 : COPYRIGHT SIGN
// AA = U+0404 : CYRILLIC CAPITAL LETTER UKRAINIAN IE
// AB = U+00AB : LEFT-POINTING DOUBLE ANGLE QUOTATION MARK
// AC = U+00AC : NOT SIGN
// AD = U+00AD : SOFT HYPHEN
// AE = U+00AE : REGISTERED SIGN
// AF = U+0407 : CYRILLIC CAPITAL LETTER YI
// B0 = U+00B0 : DEGREE SIGN
// B1 = U+00B1 : PLUS-MINUS SIGN
// B2 = U+0406 : CYRILLIC CAPITAL LETTER BYELORUSSIAN-UKRAINIAN I
// B3 = U+0456 : CYRILLIC SMALL LETTER BYELORUSSIAN-UKRAINIAN I
// B4 = U+0491 : CYRILLIC SMALL LETTER GHE WITH UPTURN
// B5 = U+00B5 : MICRO SIGN
// B6 = U+00B6 : PILCROW SIGN
// B7 = U+00B7 : MIDDLE DOT
// B8 = U+0451 : CYRILLIC SMALL LETTER IO
// B9 = U+2116 : NUMERO SIGN
// BA = U+0454 : CYRILLIC SMALL LETTER UKRAINIAN IE
// BB = U+00BB : RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK
// BC = U+0458 : CYRILLIC SMALL LETTER JE
// BD = U+0405 : CYRILLIC CAPITAL LETTER DZE
// BE = U+0455 : CYRILLIC SMALL LETTER DZE
// BF = U+0457 : CYRILLIC SMALL LETTER YI
// C0 = U+0410 : CYRILLIC CAPITAL LETTER A
// C1 = U+0411 : CYRILLIC CAPITAL LETTER BE
// C2 = U+0412 : CYRILLIC CAPITAL LETTER VE
// C3 = U+0413 : CYRILLIC CAPITAL LETTER GHE
// C4 = U+0414 : CYRILLIC CAPITAL LETTER DE
// C5 = U+0415 : CYRILLIC CAPITAL LETTER IE
// C6 = U+0416 : CYRILLIC CAPITAL LETTER ZHE
// C7 = U+0417 : CYRILLIC CAPITAL LETTER ZE
// C8 = U+0418 : CYRILLIC CAPITAL LETTER I
// C9 = U+0419 : CYRILLIC CAPITAL LETTER SHORT I
// CA = U+041A : CYRILLIC CAPITAL LETTER KA
// CB = U+041B : CYRILLIC CAPITAL LETTER EL
// CC = U+041C : CYRILLIC CAPITAL LETTER EM
// CD = U+041D : CYRILLIC CAPITAL LETTER EN
// CE = U+041E : CYRILLIC CAPITAL LETTER O
// CF = U+041F : CYRILLIC CAPITAL LETTER PE
// D0 = U+0420 : CYRILLIC CAPITAL LETTER ER
// D1 = U+0421 : CYRILLIC CAPITAL LETTER ES
// D2 = U+0422 : CYRILLIC CAPITAL LETTER TE
// D3 = U+0423 : CYRILLIC CAPITAL LETTER U
// D4 = U+0424 : CYRILLIC CAPITAL LETTER EF
// D5 = U+0425 : CYRILLIC CAPITAL LETTER HA
// D6 = U+0426 : CYRILLIC CAPITAL LETTER TSE
// D7 = U+0427 : CYRILLIC CAPITAL LETTER CHE
// D8 = U+0428 : CYRILLIC CAPITAL LETTER SHA
// D9 = U+0429 : CYRILLIC CAPITAL LETTER SHCHA
// DA = U+042A : CYRILLIC CAPITAL LETTER HARD SIGN
// DB = U+042B : CYRILLIC CAPITAL LETTER YERU
// DC = U+042C : CYRILLIC CAPITAL LETTER SOFT SIGN
// DD = U+042D : CYRILLIC CAPITAL LETTER E
// DE = U+042E : CYRILLIC CAPITAL LETTER YU
// DF = U+042F : CYRILLIC CAPITAL LETTER YA
// E0 = U+0430 : CYRILLIC SMALL LETTER A
// E1 = U+0431 : CYRILLIC SMALL LETTER BE
// E2 = U+0432 : CYRILLIC SMALL LETTER VE
// E3 = U+0433 : CYRILLIC SMALL LETTER GHE
// E4 = U+0434 : CYRILLIC SMALL LETTER DE
// E5 = U+0435 : CYRILLIC SMALL LETTER IE
// E6 = U+0436 : CYRILLIC SMALL LETTER ZHE
// E7 = U+0437 : CYRILLIC SMALL LETTER ZE
// E8 = U+0438 : CYRILLIC SMALL LETTER I
// E9 = U+0439 : CYRILLIC SMALL LETTER SHORT I
// EA = U+043A : CYRILLIC SMALL LETTER KA
// EB = U+043B : CYRILLIC SMALL LETTER EL
// EC = U+043C : CYRILLIC SMALL LETTER EM
// ED = U+043D : CYRILLIC SMALL LETTER EN
// EE = U+043E : CYRILLIC SMALL LETTER O
// EF = U+043F : CYRILLIC SMALL LETTER PE
// F0 = U+0440 : CYRILLIC SMALL LETTER ER
// F1 = U+0441 : CYRILLIC SMALL LETTER ES
// F2 = U+0442 : CYRILLIC SMALL LETTER TE
// F3 = U+0443 : CYRILLIC SMALL LETTER U
// F4 = U+0444 : CYRILLIC SMALL LETTER EF
// F5 = U+0445 : CYRILLIC SMALL LETTER HA
// F6 = U+0446 : CYRILLIC SMALL LETTER TSE
// F7 = U+0447 : CYRILLIC SMALL LETTER CHE
// F8 = U+0448 : CYRILLIC SMALL LETTER SHA
// F9 = U+0449 : CYRILLIC SMALL LETTER SHCHA
// FA = U+044A : CYRILLIC SMALL LETTER HARD SIGN
// FB = U+044B : CYRILLIC SMALL LETTER YERU
// FC = U+044C : CYRILLIC SMALL LETTER SOFT SIGN
// FD = U+044D : CYRILLIC SMALL LETTER E
// FE = U+044E : CYRILLIC SMALL LETTER YU
// FF = U+044F : CYRILLIC SMALL LETTER YA
//
// The contents of this file are subject to the Mozilla Public License Version 1.0 (the "License");
// you may not use this file except in compliance with the License. You may obtain a copy of the
// License at http://www.mozilla.org/MPL/
//
// Software distributed under the License is distributed on an "AS IS" basis,
// WITHOUT WARRANTY OF ANY KIND, either express or implied.
// See the License for the specific language governing rights and limitations under the License.
//
// The Original Code is: all this file.
//
// The Initial Developer of the Original Code is
// Aleksei Makarov [makarov@iitam.omsk.net.ru]
//
// Portions created by (your name) are Copyright (C) (your legal entity). All Rights Reserved.
//
// Contributor(s): none.
//