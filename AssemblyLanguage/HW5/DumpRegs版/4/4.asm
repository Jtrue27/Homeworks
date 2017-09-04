INCLUDE Irvine32.inc
.data
Array1 DWORD 1,2,3,4,5,6,7,8,9
Array2 DWORD 1,2,3,3,3,3
Array3 DWORD 45,45,45,56,56,56,77,88
Sample DWORD 9
Size1 DWORD SIZEOF Array1 / SIZEOF Sample
Size2 DWORD SIZEOF Array2 / SIZEOF Sample
Size3 DWORD SIZEOF Array3 / SIZEOF Sample
.code
main PROC
   mov ecx,Size1
   mov esi,OFFSET Array1
   Call FindThrees
   Call DumpRegs
   Call Crlf
   mov ecx,Size2
   mov esi,OFFSET Array2
   Call FindThrees 
   Call DumpRegs
   Call Crlf
   mov ecx,Size3
   mov esi,OFFSET Array3
   Call FindThrees 
  Call DumpRegs
   Call Crlf
   exit
main ENDP

FindThrees PROC
   mov eax,0    ;原本return 0
   L1:
   mov ebx,[esi]
     .IF(ebx==3)
	    add esi,4
		dec ecx
		mov ebx,[esi]
		.IF(ebx==3)
		 add esi,4
		 dec ecx
		 mov ebx,[esi]
		   .IF(ebx==3)
		    add esi,4
			dec ecx
			mov eax,1   ;連續3個3 return 1
			.ENDIF
		.ENDIF
	.ENDIF
  add esi,4
  Loop L1
  ret

FindThrees EndP
End main