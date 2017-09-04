INCLUDE Irvine32.inc
.data
Array1 DWORD 1,2,3,4,5,6,7,8,9
Array2 DWORD 1,2,3,4,5,4,3,2,1
Sample DWORD 9
Size1 DWORD SIZEOF Array1 / SIZEOF Sample
Size2 DWORD SIZEOF Array2 / SIZEOF Sample
Diff DWORD ?
Count DWORD 0
.code
main PROC
	mov esi,OFFSET Array1  ;Pointer Of Array1
	mov edi,OFFSET Array2  ;Pointer Of Array1
	mov ecx,Size1          ;Size Of Two Array
	mov Diff,3             ;Diffenet
	Call CountNearMatches  ;Call Procedure
	Call WriteInt          ;Call WriteInt
	Call crlf              ;New line
	exit                   ;End this program
main ENDP

CountNearMatches PROC

L1:
	mov eax,[esi]
	mov ebx,[edi]
    sub eax,ebx
	.IF(eax<=diff)
	  inc count
	  .ENDIF
    add esi,4
	add esi,4
Loop L1
mov eax,count
ret
CountNearMatches EndP
End main