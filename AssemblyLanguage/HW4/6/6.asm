
msgMenu Byte "AND,OR,NOT,XOR���:",0dh,0ah
	Byte 0dh,0ah
	Byte "1. x AND y"     ,0dh,0ah
	Byte "2. x OR y"      ,0dh,0ah
	Byte "3. NOT x"       ,0dh,0ah
	Byte "4. x XOR y"     ,0dh,0ah
	Byte "5. Exit program",0

msgAND Byte "AND_op:",0
msgOR  Byte "OR_op:",0
msgNOT Byte "NOT_op:",0
msgXOR Byte "XOR_op:",0

msgEnter Byte "Your input value is:",0
msgOperand1 Byte "Input the first  hexadecimal operand : ",0
msgOperand2 Byte "Input the second  hexadecimal operand: ",0
msgResult   Byte "The hexadecimal result is            : ",0

caseTable Byte '1'	; ��ܲM��
	DWord AND_op	; procrdure���a�}
	EntrySize = ($ - caseTable )INCLUDE Irvine32.inc
.data
	Byte '2'
	DWord OR_op
	Byte '3'
	DWord NOT_op
	Byte '4'
	DWord XOR_op
	Byte '5'
	DWord ExitProgram
   NumberOfEntries = ($ - caseTable) / EntrySize

.code
main PROC
	call Clrscr

Menu:
	mov edx, OFFSET msgMenu	
	call WriteString    ;�L���
	call Crlf

L1:	
    call Readchar
	mov edx,OFFSET msgEnter
	call WriteString
    call writechar
	cmp al, '5'	; �O�_1~5
	ja L1	; �p�G>5�hL1
	cmp al, '1'
	jb L1	; <1 �^�hL1

	call Crlf
	call ChooseProcedure
	jc quit	; if CF = 1 exit

	call Crlf
	jmp Menu	; �b��ܤ@���M��

quit: exit

main ENDP


ChooseProcedure PROC
; AL = number of procedure

	push ebx
	push ecx

	mov ebx, OFFSET caseTable	; ���Vtable
	mov ecx, NumberOfEntries	; counter

L1:	cmp al, [ebx]	; 
	jne L2	; 
	call NEAR PTR [ebx + 1]	;
	jmp L3

L2:	add ebx, EntrySize	;
	loop L1	; 

L3:	pop ecx
	pop ebx

	ret
ChooseProcedure ENDP


AND_op PROC
	pushad	; �O�sRegister,�YPUSH

	mov edx, OFFSET msgAND	; Operation
	call WriteString	; �æL�X��
	call Crlf
	

	mov edx, OFFSET msgOperand1	; ask for first operand
	call WriteString
	call ReadHex	; Ū�Ĥ@��16�i�쪺��
	mov ebx, eax	; ����ebx

	mov edx, OFFSET msgOperand2	; ask for second operand
	call WriteString
	call ReadHex	;eax=�ĤG��16�i���

	and eax, ebx	; ��o��Ӱ�And

	mov edx, OFFSET msgResult	; ���G��operation
	call WriteString
	call WriteHex	; �⵲�G�L�X��
	call Crlf

	popad	;��_Register�A�YPOP
	ret
AND_op ENDP


OR_op PROC
    ;����PAND�j�P�ۦP
	pushad	; �O�sRegister,�YPUSH

	mov edx, OFFSET msgOR	
	call WriteString	
	call Crlf
	

	mov edx, OFFSET msgOperand1	
	call WriteString
	call ReadHex	
	mov ebx, eax	

	mov edx, OFFSET msgOperand2	
	call WriteString
	call ReadHex	

	or eax, ebx	; 

	mov edx, OFFSET msgResult	
	call WriteString
	call WriteHex
	call Crlf

	popad	
	ret
OR_op ENDP


NOT_op PROC

	pushad	

	mov edx, OFFSET msgNOT	
	call WriteString	
	call Crlf
	

	mov edx, OFFSET msgOperand1	
	call WriteString
	call ReadHex	;Ū�@�Ӽ�

	not eax	; ��NOT

	mov edx, OFFSET msgResult	
	call WriteString
	call WriteHex	
	call Crlf

	popad	
	ret
NOT_op ENDP


XOR_op PROC

	pushad	

	mov edx, OFFSET msgXOR	
	call WriteString	
	call Crlf
	

	mov edx, OFFSET msgOperand1	
	call WriteString
	call ReadHex	
	mov ebx, eax	

	mov edx, OFFSET msgOperand2
	call WriteString
	call ReadHex	
	xor eax, ebx	

	mov edx, OFFSET msgResult	
	call WriteString
	call WriteHex	
	call Crlf

	popad	
	ret

XOR_op ENDP

ExitProgram PROC

; Returns: Sets CF = 1 to signal end of program

	stc	; CF = 1
	ret
ExitProgram ENDP

END main



