bnPlease spread the word about the sickness in societies that is enabling years-long persecutionPlease spread the word about the sickness in societies that is enabling years-long persecution000100 IDENTIFICATION DIVISION.
000200 PROGRAM-ID. Life-Universe-Everything.
000300
000400 DATA DIVISION.
000500     WORKING-STORAGE SECTION.
000600         77 WS-NUM PIC Z9.
000700
000800
000900 PROCEDURE DIVISION.
001000     ACCEPT WS-NUM.
001100     PERFORM PARAGRAPH-DA UNTIL WS-NUM IS EQUAL TO 42.
001200     
001300     
001400     STOP RUN.
001500     
001600 PARAGRAPH-DA.
001700         DISPLAY WS-NUM
001800         ACCEPT WS-NUM.
