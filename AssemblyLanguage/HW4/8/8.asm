INCLUDE Irvine32.inc
.data
   InputArray Byte "This is a Plaintext message",0
   KeyArray Byte "ABXmv#7",0
   EncryptMsg Byte "Encrypt Massage: ",0
   DecryptMsg Byte "Decrypt Massage: ",0
.code
main PROC
   mov edx,OFFSET EncryptMsg
   Call WriteString 
   Call Crlf
   Call Encrypt
   mov edx,OFFSET DecryptMsg
   Call WriteString 
   Call Crlf
   Call  Encrypt ;�A���@���A�{�����e�ۦP
   Exit
main ENDP


Encrypt PROC
   mov ecx,sizeof    InputArray      ;��inputArray���Ӽ�
     mov esi,offset  InputArray      ;esi���VInputArray 

   Continue:                               ;���Y�}�lŪ
	 mov edi,offset KeyArray           ;edi���VKeyArray
	 dec ecx
   L1:
	  mov al,[esi]
	  xor al,[edi]                     ;��XOR
	  mov [esi],al
	  inc esi
	  inc edi

	  cmp esi,offset InputArray+lengthof InputArray-1;����O�_��FInputArray������
          je PrintResult                                   ; Jump to final if equal
	  cmp edi,offset KeyArray+lengthof KeyArray-1    ;����O�_��F KeyArray������
		  je Continue                                    ;jump to next if equal

	  Loop L1
   PrintResult:
	    mov edx,OFFSET InputArray
	    Call WriteString
		Call Crlf
		
	Ret
Encrypt ENDP


END main