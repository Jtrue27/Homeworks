INCLUDE Irvine32.inc
.data
    Array SDWORD 13,68,3,45,5,1
    Sample SDWORD 0
	Count SDWORD SIZEOF Array / SIZEOF Sample ; number of elements
	firstmsg Byte "First Call Procedure,sum is:",0
	secondmsg Byte "Second Call Procedure,sum is",0 
.code
SumArray PROC 
	mov eax,0
L1:
     mov ebx,[esi]
    .IF (ebx<=edi)&&(ebx>=edx)
	 add eax,[esi] 
	.ENDIF
	add esi,4
	Loop L1
	ret
SumArray ENDP

main PROC
   ;第一次呼叫
   mov edx,Offset firstmsg
   Call WriteString
   Call crlf
   mov ecx,count ;passing size
   mov esi,offset Array   ;passing pointer
   I=1
   J=20
   mov edx,i     ;passing I
   mov edi,j     ;passing J
   call sumArray
   call writeINt
   call crlf
  ; 第二次呼叫
   mov edx,Offset secondmsg
   Call WriteString
   Call crlf
   mov ecx,count;passing size
   mov esi,offset Array  ;passing pointer
   I=10
   J=50
   mov edx,I  ;passing i
   mov edi,J   ;passing j
   call sumArray
   call writeINt
   call crlf
   Exit
main ENDP

END main